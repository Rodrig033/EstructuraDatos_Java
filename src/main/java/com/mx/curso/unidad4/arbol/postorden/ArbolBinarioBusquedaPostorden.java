package com.mx.curso.unidad4.arbol.postorden;

public class ArbolBinarioBusquedaPostorden {
    Nodo raiz;

    public ArbolBinarioBusquedaPostorden() {
        raiz = null;
    }


    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    /**
     * Función recursiva para insertar un nuevo valor manteniendo la propiedad BST.
     */
    Nodo insertarRecursivo(Nodo raizActual, int valor) {
        if (raizActual == null) {
            return new Nodo(valor);
        }

        if (valor < raizActual.valor) {
            raizActual.izquierda = insertarRecursivo(raizActual.izquierda, valor);
        } else if (valor > raizActual.valor) {
            raizActual.derecha = insertarRecursivo(raizActual.derecha, valor);
        }

        return raizActual;
    }

    /**
     * Recorrido Postorden: Izquierda -> Derecha -> Raíz (Imprimir)
     */
    void recorrerPostorden(Nodo nodo) {
        if (nodo != null) {
            // 1. Recorre el subárbol izquierdo
            recorrerPostorden(nodo.izquierda);

            // 2. Recorre el subárbol derecho
            recorrerPostorden(nodo.derecha);

            // 3. Visita la raíz (imprime el valor al final)
            System.out.print(nodo.valor + " ");
        }
    }

    // Método público para iniciar el recorrido desde la raíz
    public void recorrido() {
        recorrerPostorden(raiz);
    }
}