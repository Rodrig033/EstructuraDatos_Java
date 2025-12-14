package com.mx.curso.unidad3.lista.doble;

public class NodoDoble {
    // Almacenamos el dato
    int dato;
    // Puntero al siguiente nodo de la secuencia
    NodoDoble siguiente;
    // Puntero al nodo anterior de la secuencia
    NodoDoble anterior;

    // Constructor de la clase:
    public NodoDoble (int dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
