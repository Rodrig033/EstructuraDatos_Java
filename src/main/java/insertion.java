public class insertion {

    // Función para mostrar el estado de la lista
    public static void mostrarLista(int[] lista, int lon) {
        for (int i = 0; i < lon; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 2, 4, 1, 3};

        // Recorrer el arreglo
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;

            // Comparar el valor seleccionado con los anteriores
            while (j >= 0 && arreglo[j] > clave) {
                // Insertar el valor donde corresponda
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = clave;

            // Mostrar el estado del arreglo en cada paso
            mostrarLista(arreglo, arreglo.length);
        }

        // Mostrar el resultado final
        mostrarLista(arreglo, arreglo.length);
    }
}
