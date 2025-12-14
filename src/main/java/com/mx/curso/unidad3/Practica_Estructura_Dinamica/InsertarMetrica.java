package com.mx.curso.unidad3.Practica_Estructura_Dinamica;

public class InsertarMetrica {
    public static void main(String[] args){
        EntrenamientoModelo historial = new EntrenamientoModelo();

        historial.insertarMetricaFin(70);
        historial.insertarMetricaFin(83);
        historial.insertarMetricaFin(45);
        historial.insertarMetricaFin(20);
        historial.insertarMetricaFin(33);

        System.out.println();
        historial.historialMetricas();

        historial.buscarMetrica(33);
        historial.buscarMetrica(45);
    }
}
