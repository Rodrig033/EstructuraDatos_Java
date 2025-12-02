package com.mx.curso.unidad3.lista.simple;

public class ListaEnlazada {

    Nodo cabeza;
    public ListaEnlazada(){
        this.cabeza = null;
    }
    public void insertarAlInicio (int nuevoDato){
        // Creamos un nuevo nodo:
        Nodo nuevoNodo = new Nodo(nuevoDato);
        nuevoNodo.siguiente = cabeza;

        cabeza = nuevoNodo;
        System.out.println("Insertado al inicio " + nuevoDato);
    }

    public void insertarAlFinal (int nuevoDato){
        Nodo nuevo = new Nodo(nuevoDato);

        if(cabeza == null){
            Nodo nuevoNodo = null;
            cabeza = nuevoNodo;
            System.out.println("Insertar al final (Lista vacia)" + nuevoDato);
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null){
            actual = actual.siguiente;
        }
        // El último nodp apunto al nuevo nodo
    }

    public void imprimirLista(){
        Nodo actual = cabeza;
        System.out.println("Lista simple");

        while (actual != null) {
            System.out.println(actual.dato + " -> ");
            actual = actual.siguiente;
        }
    }
}
