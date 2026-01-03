package com.mx.curso.unidad3.practica_listas_02;

import com.mx.curso.unidad3.lista.simple.Nodo;

public class ChatBot {
    NodoChat cabeza;
    public ChatBot(){
        this.cabeza = null;
    }

    public void insertarMensajeInicio (String nuevoDato){
        // Creamos un nuevo nodo:
        NodoChat nuevoNodo = new NodoChat(nuevoDato);
        nuevoNodo.siguiente = cabeza;

        cabeza = nuevoNodo;
        System.out.println("Insertado al inicio " + nuevoDato);
    }

    public void insertarFinalUser (String nuevoDato){
        NodoChat nuevo = new NodoChat(nuevoDato);

        if (cabeza == null) {
            cabeza = nuevo;
            System.out.println("USER: " + nuevoDato);
            return;
        }

        NodoChat actual = cabeza;
        while (actual.siguiente != null){
            actual = actual.siguiente;
        }
        // Enlazar el último nodo con el nuevo:
        actual.siguiente = nuevo;
        System.out.println("USER: " + nuevoDato);
    }

    public void insertarFinalBot (String nuevoDato){
        NodoChat nuevo = new NodoChat(nuevoDato);

        if (cabeza == null) {
            cabeza = nuevo;
            System.out.println("Insertar al final (Lista vacía): " + nuevoDato);
            return;
        }

        NodoChat actual = cabeza;
        while (actual.siguiente != null){
            actual = actual.siguiente;
        }
        // Enlazar el último nodo con el nuevo:
        actual.siguiente = nuevo;
        System.out.println("BOT: " + nuevoDato);
    }

    public void imprimirChat() {
        NodoChat actual = cabeza;
        System.out.println("---- Historial ----");

        while (actual != null) {
            System.out.print(actual.mensaje + " -> ");
            actual = actual.siguiente;
        }
    }
}

