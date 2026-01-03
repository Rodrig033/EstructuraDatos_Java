package com.mx.curso.unidad3.practica_listas_02;


import java.util.LinkedList;
import java.util.Queue;

public class ColaTareas {
    public static void main(String[] args){
        Queue<String>colaSolicitud = new LinkedList<>();

        // Solicitudes
        colaSolicitud.offer("Analizar sentimientos en el Tweet de Elon Musk");
        colaSolicitud.offer("Extraer entidades nombradas en el texto");
        colaSolicitud.offer("Crea una imagen de un oso tomando café");
        colaSolicitud.offer("Corregir gramatica en el documento");
        colaSolicitud.offer("Clasificar toxicidad en el comentario de la publicación");
        colaSolicitud.offer("Generar un resumen de un artículo científico");

        int total = colaSolicitud.size();
        int restante = total;

        System.out.println("Solicitudes recibidas: " + colaSolicitud);
        System.out.println("\n---- Procesando solicitudes en orden FIFO ----");
        System.out.println("Total de solicitudes: " + total);
        while (!colaSolicitud.isEmpty()){
            String solicitud = colaSolicitud.poll();
            restante--;
            System.out.println("Procesando solicitud: " + solicitud);
            System.out.println("Restantes " + restante);
        }

        System.out.println("Cola después de atender las solicitudes -> " + colaSolicitud);
    }
}
