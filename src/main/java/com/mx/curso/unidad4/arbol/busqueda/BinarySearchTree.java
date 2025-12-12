package com.mx.curso.unidad4.arbol.busqueda;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        this.root = insertRecursive(root, data);
    }


    private Node insertRecursive(Node current, int data) {
        // Caso Base 1: Si el nodo actual es null, hemos encontrado la posición.
        if (current == null) {
            return new Node(data);
        }

        // Caso Recursivo: Comparamos el valor para decidir si vamos a la izquierda o derecha.
        if (data < current.data) {
            // Ir a la izquierda
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            // Ir a la derecha
            current.right = insertRecursive(current.right, data);
        }

        // Si el valor es igual, simplemente lo ignoramos (opción común en BST)
        return current;
    }


    public void traverseInOrder() {
        System.out.print("In-Order (Ordenado): ");
        traverseInOrderRecursive(root);
        System.out.println();
    }


    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);
            System.out.print(node.data + " ");
            traverseInOrderRecursive(node.right);
        }
    }
}