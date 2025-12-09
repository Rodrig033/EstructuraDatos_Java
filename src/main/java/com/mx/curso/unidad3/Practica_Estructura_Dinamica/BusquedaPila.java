package com.mx.curso.unidad3.Practica_Estructura_Dinamica;

public class BusquedaPila {
    private NodoPila tope;

    public BusquedaPila(){
        this.tope = null;
    }

    public void agregar(String estado){
        NodoPila nuevo = new NodoPila(estado);
        nuevo.siguiente = tope;
        tope = nuevo;
        System.out.println("Push" + estado);
    }

    public String eliminar(){
        if(tope == null){
            System.out.println("La pila está vacía");
            return null;
        }
        String valor = tope.estado;
        tope = tope.siguiente;
        System.out.println("Estados pendientes por explorar:");
        NodoPila actual = tope;

        while (actual != null){
            System.out.println(" - " + actual.estado);
            actual = actual.siguiente;
        }
        System.out.println();
        return valor;
    }

    public void mostrarPila() {

    }
}


