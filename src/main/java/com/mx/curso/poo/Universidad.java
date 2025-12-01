package com.mx.curso.poo;

public class Universidad {

    // Metodo principal de Java para invocar a los objetos:
    public static void main(String[] args){

        // Crear un objeto de la clase Alumno:
        Alumno alumno = new Alumno();
        alumno.inscripcionCurso();
        alumno.inscripcionTaller();
        System.out.println("Mensualidad: " + alumno.pagoMensualidad());
        System.out.println("Horas de estudio: " + alumno.calcularHorasEstudio(1, 5));
        System.out.println("***********************************************************");

        // Crear un objeto de la clase Alumno:
        Alumno alumno2 = new Alumno();
        alumno2.inscripcionCurso();
        alumno2.inscripcionTaller();
        System.out.println("Horas de estudio: " + alumno.calcularHorasEstudio(1, 5));


        Docente docente = new Docente();
        docente.asignarCalificacion();

        // Invocar al metodo sin crear un objeto de la clase docente:
        Docente.asignarCalificacion();
    }

}
