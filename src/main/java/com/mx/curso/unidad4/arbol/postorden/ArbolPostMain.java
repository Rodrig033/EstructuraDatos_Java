package com.mx.curso.unidad4.arbol.postorden;

public class ArbolPostMain {

    public static void main(String[] args) {
        ArbolBinarioBusquedaPostorden arbol = new ArbolBinarioBusquedaPostorden();

        // Valores de entrada desordenados, igual que el ejemplo anterior:
        int[] datosDesordenados = {10, 5, 15, 2, 7, 12, 18, 1, 6};



        // El árbol se construye de forma auto-organizada (BST)
        for (int dato : datosDesordenados) {
            arbol.insertar(dato);
        }

        System.out.println("\nEstructura del arbol construida. Realizando recorrido Postorden...");

        // El recorrido Postorden produce una secuencia diferente
        System.out.print("Resultado del recorrido Postorden: ");
        arbol.recorrido();


        System.out.println("\n");

    }

}
