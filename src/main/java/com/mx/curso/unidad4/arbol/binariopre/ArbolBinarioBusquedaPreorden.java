package com.mx.curso.unidad4.arbol.binariopre;

public class ArbolBinarioBusquedaPreorden {
    Nodo raiz;

    public ArbolBinarioBusquedaPreorden() {
        raiz = null;
    }


    /**
     * Método público que inicia la inserción desde la raíz.
     */
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
     * Recorrido Preorden: Raíz (Imprimir) -> Izquierda -> Derecha
     */
    void recorrerPreorden(Nodo nodo) {
        if (nodo != null) {
            // 1. Visita la raíz (imprime el valor al inicio)
            System.out.print(nodo.valor + " ");

            // 2. Recorre el subárbol izquierdo
            recorrerPreorden(nodo.izquierda);

            // 3. Recorre el subárbol derecho
            recorrerPreorden(nodo.derecha);
        }
    }

    // Método público para iniciar el recorrido desde la raíz
    public void recorrido() {
        recorrerPreorden(raiz);
    }}
