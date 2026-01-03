package com.mx.curso.unidad3.simuladores;

class Nodo {
    String dato;
    Nodo siguiente;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class PilaListaEnlazada {
    private Nodo cima;

    public PilaListaEnlazada() {
        this.cima = null;
    }

    public void push(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public String pop() {
        if (cima == null) {
            return null;
        }
        String dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void mostrar() {
        Nodo actual = cima;

        System.out.print("Stack: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();

    }
}