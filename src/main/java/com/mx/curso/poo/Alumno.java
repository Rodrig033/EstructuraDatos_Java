package com.mx.curso.poo;

public class Alumno {
    private String matricula;
    private String nombre;

    // Constructor
    public Alumno(){
        System.out.println("El alumno se ha creado...");
    }

    // Metodos
    public void inscripcionCurso() {
        System.out.println("El alumno se ha inscrito al curso.");
    }

    public void inscripcionTaller() {
        System.out.println("El alumno se ha inscrito al taller de Base de datos.");
    }

    public double pagoMensualidad() {
        return 1500.00;
    }

    public int calcularHorasEstudio(int horasPorDia, int diasSemana){
        return horasPorDia * diasSemana;
    }

}
