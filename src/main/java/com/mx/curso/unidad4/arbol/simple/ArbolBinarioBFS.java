package com.mx.curso.unidad4.arbol.simple;

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinarioBFS {
    Nodo root;

    public ArbolBinarioBFS() {
        this.root = null;
    }

    public void insertarPorNiveles(int data) {
        Nodo nuevoNodo = new Nodo(data);


        if (root == null) {
            root = nuevoNodo;
            return;
        }


        Queue<Nodo> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()) {
            Nodo temp = queue.poll();

            // 1. Intentar insertar como hijo izquierdo
            if (temp.left == null) {
                temp.left = nuevoNodo;
                return;
            } else {
                // Si ya tiene hijo izquierdo, lo agregamos a la cola para revisar sus hijos
                queue.add(temp.left);
            }

            // 2. Intentar insertar como hijo derecho
            if (temp.right == null) {
                temp.right = nuevoNodo;
                return;
            } else {
                // Si ya tiene hijo derecho, lo agregamos a la cola para revisar sus hijos
                queue.add(temp.right);
            }
        }
    }

    public void mostrarPorNiveles() {
        if (root == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        Queue<Nodo> queue = new LinkedList<>();
        queue.add(root);

        System.out.println("--- Estructura del Arbol (Por Niveles) ---");

        while (!queue.isEmpty()) {
            int nivelSize = queue.size();
            for (int i = 0; i < nivelSize; i++) {
                Nodo temp = queue.poll();

                // Imprimir el dato del nodo actual
                System.out.print(temp.data + " ");

                // Agregar hijos a la cola
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            System.out.println();
        }
    }}