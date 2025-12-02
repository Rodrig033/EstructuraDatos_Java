package com.mx.curso.unidad3.lista.simple;

public class Nodo {
    // Almacena el dato
    int dato;
    // Puntero al siguiente nodo de la secuencia
    Nodo siguiente;

    // Constructor de la clase:
    public Nodo (int dato){
        this.dato = dato;
        this.siguiente = null;
    }
}
