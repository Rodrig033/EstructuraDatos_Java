package com.mx.curso.unidad3.Practica_Estructura_Dinamica;

public class DFS_Pila {
    public static void main(String[] args) {

        BusquedaPila pila = new BusquedaPila();

        // Simulación: estados por explorar (como nodos en DFS)
        pila.agregar("Inicio en A");
        pila.agregar("Explorar A -> B");
        pila.agregar("Explorar B -> C");
        pila.agregar("Retroceder, explorar otro camino");
        pila.agregar("Intentar ruta alternativa en D");

        pila.mostrarPila();

        // Procesamiento LIFO
        System.out.println("----- Iniciando exploración LIFO  -----\n");
        while (pila.eliminar() != null) {}
    }
}