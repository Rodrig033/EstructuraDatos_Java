package com.mx.curso.unidad3.simuladores;

public class SimuladorDFS {
    public static void main(String[] args){

        PilaListaEnlazada pila = new PilaListaEnlazada();
        pila.push("A");
        System.out.println("Inicio en A");
        pila.mostrar();

        String actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        pila.push("B");
        System.out.println("B Vecino de A");
        pila.mostrar();

        pila.push("C");
        System.out.println("C Vecino de B");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        pila.push("D");
        System.out.println("D Vecino C");
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        pila.push("E");
        System.out.println("E Vecino de B");
        pila.mostrar();

    }
}
