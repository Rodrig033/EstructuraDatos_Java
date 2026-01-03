package com.mx.curso.unidad3.practica_listas_02;

import com.mx.curso.unidad3.simuladores.PilaListaEnlazada;

public class RutaProfundidad {
    public static void main(String[] args){

        PilaListaEnlazada ruta = new PilaListaEnlazada();
        ruta.push("México");
        System.out.println("PUSH: México");
        ruta.mostrar();

        String actual = ruta.pop();
        System.out.println("Visitando -> " + actual);
        ruta.mostrar();

        ruta.push("Puebla");
        System.out.println("PUSH: Puebla (vecino de México)");
        ruta.mostrar();

        ruta.push("Guanajuato");
        System.out.println("PUSH: Guanajuato (vecino de Puebla)");
        ruta.mostrar();

        actual = ruta.pop();
        ruta.pop();
        System.out.println("POP -> Visitando " + actual);
        ruta.mostrar();

        ruta.push("San Luis Potosí");
        System.out.println("PUSH: San Luis Potosí (vecino de Guanajuato)");
        ruta.mostrar();

        actual = ruta.pop();
        ruta.pop();
        System.out.println("POP -> Visitando  " + actual);
        ruta.mostrar();

        ruta.push("Nuevo León");
        System.out.println("PUSH: Nuevo León (vecino de San Luis Potosí)");
        ruta.mostrar();

        ruta.pop();
        System.out.println("POP -> Visitando  " + actual);
        ruta.mostrar();

    }
}
