import com.mx.curso.unidad4.arbol.binariopre.ArbolBinarioBusquedaPreorden;

public static void main(String[] args) {
    ArbolBinarioBusquedaPreorden arbol = new ArbolBinarioBusquedaPreorden();

    // Valores de entrada desordenados:
    int[] datosDesordenados = {1, 5, 17, 21, 7, 4, 99, 8, 6};


    // El árbol se construye de forma auto-organizada (BST)
    for (int dato : datosDesordenados) {
        arbol.insertar(dato);
    }

    System.out.println("\nEstructura del árbol construida. Realizando recorrido Preorden...");

    // El recorrido Preorden produce una secuencia que comienza por la raíz
    System.out.print("Resultado del recorrido Preorden: ");
    arbol.recorrido();

    // CORRECCIÓN: La raíz es visitada al inicio en Preorden.
    System.out.println("\n");

}

