package com.mx.curso.unidad3.pila.practica_01;

import java.util.ArrayDeque;

public class EjemploStack {
    public static void main(String[] args){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Contenido de la pila " + stack);
        int elemento = stack.pop();
        System.out.println("Elemento: " + elemento);
    }
}
