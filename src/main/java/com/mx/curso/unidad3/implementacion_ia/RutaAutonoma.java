package com.mx.curso.unidad3.implementacion_ia;

import java.util.LinkedList;

public class RutaAutonoma {
    public static void main(String[] args){
        LinkedList<String> rutaActual = new LinkedList<>();
        System.out.println("Planificación de Ruta");
        rutaActual.add("Ciudad A (inicio)");
        rutaActual.add("Ciudad C");
        rutaActual.add("Ciudad D");
        rutaActual.add("Ciudad E (destino)");

        System.out.println("Ruta planificada "+ rutaActual);
        String nuevoPunto = "Ciudad B (Recarga)";
        int indiceInterseccion = 1;
        rutaActual.add(indiceInterseccion, nuevoPunto);
        System.out.println("Ruta planificada " + rutaActual);

        String puntoBloqueado = "Ciudad D";
        rutaActual.remove(puntoBloqueado);

        System.out.println("Ruta planficada " + rutaActual);

    }
}
