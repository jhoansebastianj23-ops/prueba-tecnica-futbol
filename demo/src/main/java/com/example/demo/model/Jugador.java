package com.example.demo.model;

public class Jugador {

    private String nombre;
    private double potenciaTiro;
    private double velocidad;
    private int pases;
    private double resultado;
    private int entrenamiento;

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPotenciaTiro() {
        return potenciaTiro;
    }

    public void setPotenciaTiro(double potenciaTiro) {
        this.potenciaTiro = potenciaTiro;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(int entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
}