package com.mx.curso.unidad4.arbol.Inorden;

class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int item) {
        valor = item;
        izquierda = derecha = null;
    }
}