package com.mx.curso.unidad3.lista.doble;

import com.mx.curso.unidad3.lista.simple.ListaEnlazada;

public class TestEnlazadaDoble {

    public static void main(String[] args) {
        // Crear la instancia para Lista Enlazada Doble:
        ListaDoble lista = new ListaDoble();

        System.out.println("Insertar nuevos datos ");
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);

        System.out.println("Insertar datos al final ");
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);

        lista.insertarAlInicio(50);
        lista.insertarAlInicio(100);
        lista.imprimirInicioFinal();
        lista.imprimirFinalInicio();
    }
}
