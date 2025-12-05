package com.mx.curso.unidad3.implementacion_ia;

import java.util.LinkedList;
import java.util.ListIterator;

// Implementación abstracta, nos preocupamos por el qué pero no por qué.
public class HistorialTransacciones {
    public static void main(String[] args){
        LinkedList<String> historial = new LinkedList<>();
        System.out.println("Iniciamos el historial de transacciones");
        ListIterator<String> iterador = historial.listIterator();

        iterador.add("Acción 1: Crear documento");
        iterador.add("Acción 2: Escribir título");
        iterador.add("Acción 3: Insertar Imagen");

        System.out.println("Historial Completo: " + historial);
        System.out.println("Estado Actual (Acción más reciente): " + historial.getLast());

        if (iterador.hasPrevious()) {
            String accionDes = iterador.previous();
            System.out.println("UNDO -> " + accionDes);
        }

        if (iterador.hasPrevious()) {
            String accionDes = iterador.previous();
            System.out.println("UNDO " + accionDes);
        }

        System.out.println("Estado actual -> " + iterador.next());

        if(iterador.hasNext()){
            String accionRes = iterador.next();
            System.out.println("REDO "+ accionRes);
        }
        System.out.println("Estado actual -> " + historial.get(iterador.previousIndex()));

    }
}

