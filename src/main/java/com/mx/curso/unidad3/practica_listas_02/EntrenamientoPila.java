package com.mx.curso.unidad3.practica_listas_02;

import com.mx.curso.unidad3.simuladores.PilaListaEnlazada;

public class EntrenamientoPila {
    public static void main(String[] args){

        PilaListaEnlazada entrenamiento = new PilaListaEnlazada();
        entrenamiento.push("lr = 0.01");
        System.out.println("PUSH -> Ir = 0.01");
        entrenamiento.mostrar();

        entrenamiento.push("epochs = 50");
        System.out.println("PUSH -> epochs = 50");
        entrenamiento.mostrar();

        entrenamiento.push("batch_size = 32");
        System.out.println("PUSH -> batch_size = 32");
        entrenamiento.mostrar();

        entrenamiento.push("optimizer = Farid");
        System.out.println("PUSH -> optimizer = Farid");
        entrenamiento.mostrar();

        entrenamiento.push("dropout = 0.3");
        System.out.println("PUSH -> dropout = 0.3");
        entrenamiento.mostrar();

        String actual = entrenamiento.pop();
        System.out.println("POP: Cambio revertido -> " + actual);
        entrenamiento.mostrar();

        actual = entrenamiento.pop();
        System.out.println("POP: Cambio revertido -> " + actual);
        entrenamiento.mostrar();

    }
}
