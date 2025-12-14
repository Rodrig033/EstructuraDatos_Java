package com.mx.curso.unidad4.arbol.binario;



import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    /**
     * Recorrido por Niveles (Breadth-First Search - BFS)
     */
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("Recorrido por Niveles: ");
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    /**
     * Inserta un nuevo nodo en el primer espacio disponible (Breadth-First Insertion).
     */
    public void insert(String data) {
        Node newNode = new Node(data);

        // Caso 1: El árbol está vacío
        if (root == null) {
            root = newNode;
            return;
        }

        // Caso 2: El árbol ya tiene nodos. Usamos una cola para la inserción por niveles.
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Intentar insertar a la izquierda
            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                queue.add(current.left); // Poner en cola para revisar sus hijos
            }

            // Intentar insertar a la derecha
            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                queue.add(current.right); // Poner en cola para revisar sus hijos
            }
        }
    }
}