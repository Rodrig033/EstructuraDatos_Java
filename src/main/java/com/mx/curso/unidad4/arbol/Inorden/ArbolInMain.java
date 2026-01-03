package com.mx.curso.unidad4.arbol.Inorden;

public class ArbolInMain {
    public static void main(String[] args) {
        ArbolBinarioBusquedaInorden arbol = new ArbolBinarioBusquedaInorden();

        // 1. Definimos un conjunto de valores completamente DESORDENADO.
        int[] datosDesordenados = {50, 30, 80, 20, 45, 70, 95, 15, 35, 85};




        for (int dato : datosDesordenados) {
            arbol.insertar(dato);
        }

        System.out.println("\nEstructura del árbol construida. Realizando recorrido Inorden...");


        System.out.print("Resultado del recorrido Inorden: ");
        arbol.recorrido();
        System.out.println("\n");
    }

}
