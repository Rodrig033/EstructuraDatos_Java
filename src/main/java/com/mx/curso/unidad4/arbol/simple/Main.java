import com.mx.curso.unidad4.arbol.simple.ArbolBinarioBFS;

public static void main(String[] args) {
    ArbolBinarioBFS arbol = new ArbolBinarioBFS();

    int[] datos = {1, 5, 7, 8, 90, 2, 100};
    System.out.print("Numeros a insertar en orden: ");
    for (int dato : datos) {
        System.out.print(dato + " ");
        arbol.insertarPorNiveles(dato);
    }
    System.out.println("\n");

    // Muestra la estructura jerárquica nivel por nivel
    arbol.mostrarPorNiveles();

    System.out.println("\n--- Analisis de la Estructura ---");
    System.out.println("Este arbol NO es un Arbol de Busqueda Binario (BST).");
    System.out.println("La insercion solo busca el primer lugar disponible (izquierda a derecha, nivel por nivel), ignorando el valor del dato (por ejemplo, '5' es hijo izquierdo de '1').");
}

