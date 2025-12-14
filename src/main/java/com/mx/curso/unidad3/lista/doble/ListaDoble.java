package com.mx.curso.unidad3.lista.doble;

import com.mx.curso.unidad3.lista.simple.ListaEnlazada;
import com.mx.curso.unidad3.lista.simple.Nodo;

public class ListaDoble {
    NodoDoble cabeza;
    NodoDoble cola;

    public ListaDoble(){
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarAlInicio(int nuevoDato){
        NodoDoble nuevoNodo = new NodoDoble(nuevoDato);

        if (cabeza == null){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            return;
        }
        nuevoNodo.siguiente = cabeza;
        cabeza.anterior = nuevoNodo;
        cabeza = nuevoNodo;
    }


    public void insertarAlFinal(int nuevoDato){
        NodoDoble nuevo = new NodoDoble(nuevoDato);

        if (cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
            return;
        }
        cola.siguiente = nuevo;
        nuevo.anterior = cola;
        cola = nuevo;

    }

    public void imprimirInicioFinal(){
        NodoDoble actual = cabeza;
        System.out.println("Lista doble (inicio a final): ");
        while (actual != null){
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void imprimirFinalInicio(){
        NodoDoble actual = cola;
        System.out.println("Lista doble (final a inicio): ");
        while (actual != null){
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }
}