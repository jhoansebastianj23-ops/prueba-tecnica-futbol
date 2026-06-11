package com.example.demo.controller;

import com.example.demo.model.Jugador;
import com.example.demo.service.EntrenamientoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EntrenamientoController {

    private final EntrenamientoService service;

    public EntrenamientoController(EntrenamientoService service) {
        this.service = service;
    }

    @PostMapping("/entrenamiento")
    public List<Jugador> guardarEntrenamiento(@RequestBody List<Jugador> jugadores) {
        return service.guardarEntrenamiento(jugadores);
    }

    @GetMapping("/titulares")
    public Object obtenerTitulares() {
        return service.obtenerTitulares();
    }
}