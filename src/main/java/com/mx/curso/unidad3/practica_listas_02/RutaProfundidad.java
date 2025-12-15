package com.mx.curso.unidad3.practica_listas_02;

import com.mx.curso.unidad3.simuladores.PilaListaEnlazada;

public class RutaProfundidad {
    public static void main(String[] args){

        PilaListaEnlazada ruta = new PilaListaEnlazada();
        ruta.push("México");
        System.out.println("Inicia en México");
        ruta.mostrar();

        String actual = ruta.pop();
        System.out.println("Eliminar y visitar " + actual);
        ruta.mostrar();

        ruta.push("Puebla");
        System.out.println("Hidalgo Vecino de México");
        ruta.mostrar();

        ruta.push("Guanajuato");
        System.out.println("Guanajuato Vecino de Hidalgo");
        ruta.mostrar();

        ruta.pop();
        System.out.println("Eliminar y visitar " + actual);
        ruta.mostrar();

        ruta.push("San Luis Potosí");
        System.out.println("San Luis Potosí Vecino de Guanajuato");
        ruta.mostrar();

        ruta.pop();
        System.out.println("Eliminar y visitar " + actual);
        ruta.mostrar();

        ruta.push("Nuevo León");
        System.out.println("Nuevo León Vecino de Puebla");
        ruta.mostrar();

    }
}
