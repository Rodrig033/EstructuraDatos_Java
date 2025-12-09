package com.mx.curso.unidad3.Practica_Estructura_Dinamica;

public class NodoPila {
    String estado;
    NodoPila siguiente;

    public NodoPila(String estado){
        this.estado = estado;
        this.siguiente = null;
    }
}
