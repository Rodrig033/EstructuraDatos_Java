package com.mx.curso.unidad3.pila.practica_01;

import java.util.Deque;
import java.util.ArrayDeque;

public class EjemploDeque {
    public static void main(String[] args){

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("1");
        deque.addLast("2");
        deque.addFirst("3");

        System.out.println("Contenido del DEQUE: " + deque);
        String primero = deque.removeFirst();
        System.out.println(primero);

        String ultimo = deque.removeLast();
        System.out.println(ultimo);
        System.out.println("Contedido actualizado -> " + deque);
    }
}
