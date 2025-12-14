package com.mx.curso.unidad3.practica_listas_02;
import com.mx.curso.unidad3.lista.simple.Nodo;

public class Chatbot {
    Nodo cabeza;
    public Chatbot(){
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

        if (cabeza == null) {
            cabeza = nuevo;
            System.out.println("Insertar al final (Lista vacía): " + nuevoDato);
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null){
            actual = actual.siguiente;
        }
        // Enlazar el último nodo con el nuevo:
        actual.siguiente = nuevo;
        System.out.println("Insertado al final " + nuevoDato);
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
