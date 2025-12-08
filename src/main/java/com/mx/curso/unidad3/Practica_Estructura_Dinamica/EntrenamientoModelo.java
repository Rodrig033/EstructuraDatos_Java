package com.mx.curso.unidad3.Practica_Estructura_Dinamica;

import com.mx.curso.unidad3.lista.simple.Nodo;

public class EntrenamientoModelo {
    Nodo cabeza;
    public EntrenamientoModelo(){
        this.cabeza = null;
    }

    public void insertarMetrica(int metrica){
        Nodo nuevoNodo = new Nodo(metrica);
        nuevoNodo.siguiente = cabeza;

        cabeza = nuevoNodo;
    }

    public void insertarMetricaFin(int metrica){
        Nodo nuevo = new Nodo(metrica);

        if(cabeza == null){
            cabeza = nuevo;
            System.out.println("Nueva métrica agregada: " + metrica);
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null){
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
        System.out.println("Nueva métrica agregada: " + metrica);
    }

    public void historialMetricas(){
        Nodo actual = cabeza;
        System.out.println("---- Historial de métricas ----");
        while (actual != null){
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("Null");
    }

    public boolean buscarMetrica(int metrica){
        if (cabeza == null) {
            System.out.println("La lista está vacía -> No existe la métrica " + metrica);
            return false;
        }
        Nodo actual = cabeza;
        int posicion = 1;

        System.out.println();
        while(actual != null){
            if(actual.dato == metrica){
                System.out.println("Buscando métrica " + metrica + "...");
                System.out.println("Métrica encontrada en Epoch " + posicion + " : " + metrica);
                return true;
            }
            actual = actual.siguiente;
            posicion++;
        }
        System.out.println("Buscando métrica " + metrica + "...");
        System.out.println("La métrica " + metrica + " no ha sido encontrada en el historial.");
        return false;
    }
}

