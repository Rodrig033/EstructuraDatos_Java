package com.mx.curso.unidad4.arbol.Inorden;

public class ArbolBinarioBusquedaInorden {
    Nodo raiz;

    public ArbolBinarioBusquedaInorden() {
        raiz = null;
    }

    /**
     * Método público que inicia la inserción desde la raíz.
     */
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    /**
     * Función recursiva para insertar un nuevo valor manteniendo la propiedad BST:
     * Menor va a la izquierda, Mayor va a la derecha.
     */
    Nodo insertarRecursivo(Nodo raizActual, int valor) {
        // 1. Si el subárbol está vacío, crea un nuevo nodo y lo devuelve.
        if (raizActual == null) {
            return new Nodo(valor);
        }

        // 2. Si el valor es menor, va al subárbol izquierdo.
        if (valor < raizActual.valor) {
            raizActual.izquierda = insertarRecursivo(raizActual.izquierda, valor);
        }
        // 3. Si el valor es mayor, va al subárbol derecho.
        else if (valor > raizActual.valor) {
            raizActual.derecha = insertarRecursivo(raizActual.derecha, valor);
        }
        // 4. Si el valor es igual, se ignora (no se permiten duplicados en este ejemplo).

        // 5. Devuelve el nodo (sin cambios si no se creó un nuevo nodo).
        return raizActual;
    }

    /**
     * Recorrido Inorden: Izquierda -> Raíz (Imprimir) -> Derecha
     */
    void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            // 1. Izquierda
            recorrerInorden(nodo.izquierda);

            // 2. Raíz (Imprime el valor)
            System.out.print(nodo.valor + " ");

            // 3. Derecha
            recorrerInorden(nodo.derecha);
        }
    }

    // Método público para iniciar el recorrido desde la raíz
    public void recorrido() {
        recorrerInorden(raiz);
    }
}