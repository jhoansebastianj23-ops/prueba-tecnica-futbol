package com.example.demo.service;

import com.example.demo.model.Jugador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntrenamientoService {

    private final List<Jugador> jugadores = new ArrayList<>();

    public List<Jugador> guardarEntrenamiento(List<Jugador> listaJugadores) {

        for (Jugador jugador : listaJugadores) {

            double resultado =
                    (jugador.getPotenciaTiro() * 0.20) +
                    (jugador.getVelocidad() * 0.30) +
                    (jugador.getPases() * 0.50);

            jugador.setResultado(resultado);

            jugadores.add(jugador);
        }

        return listaJugadores;
    }

    public Object obtenerTitulares() {

        long entrenamientos =
                jugadores.stream()
                        .map(Jugador::getEntrenamiento)
                        .distinct()
                        .count();

        if (entrenamientos < 3) {
            return "No hay suficiente información";
        }

        return jugadores.stream()
                .collect(Collectors.groupingBy(Jugador::getNombre))
                .values()
                .stream()
                .map(lista -> {
                    Jugador jugador = lista.get(0);

                    double promedio = lista.stream()
                            .mapToDouble(Jugador::getResultado)
                            .average()
                            .orElse(0);

                    jugador.setResultado(promedio);

                    return jugador;
                })
                .sorted(Comparator.comparingDouble(Jugador::getResultado).reversed())
                .limit(5)
                .toList();
    }
}