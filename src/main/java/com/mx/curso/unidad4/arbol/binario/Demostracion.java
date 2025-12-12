package com.mx.curso.unidad4.arbol.binario;


public class Demostracion {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");
        tree.insert("H");
        tree.insert("I");

        System.out.println("Arbol Binario Generico construido.");
        tree.traverseLevelOrder();
    }

}