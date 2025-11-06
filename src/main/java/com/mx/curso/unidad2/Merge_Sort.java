public class Merge_Sort {

    // Funci�n principal de ordenamiento
    public static int[] mergeSort(int[] lista) {
        if (lista.length <= 1) {
            return lista; // Caso base
        }

        // 1. Dividir
        int medio = lista.length / 2;
        int[] izquierda = new int[medio];
        int[] derecha = new int[lista.length - medio];

        // Copiar los elementos en cada mitad
        for (int i = 0; i < medio; i++) {
            izquierda[i] = lista[i];
        }
        for (int i = medio; i < lista.length; i++) {
            derecha[i - medio] = lista[i];
        }

        // 2. Llamadas recursivas
        izquierda = mergeSort(izquierda);
        derecha = mergeSort(derecha);

        // 3. Mezclar resultados
        return mezclar(izquierda, derecha);
    }

    // Funci�n para mezclar dos arreglos ordenados
    public static int[] mezclar(int[] izquierda, int[] derecha) {
        int[] resultado = new int[izquierda.length + derecha.length];
        int i = 0, j = 0, k = 0;

        // Comparar y mezclar
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] < derecha[j]) {
                resultado[k++] = izquierda[i++];
            } else {
                resultado[k++] = derecha[j++];
            }
        }

        // Agregar los elementos restantes
        while (i < izquierda.length) {
            resultado[k++] = izquierda[i++];
        }
        while (j < derecha.length) {
            resultado[k++] = derecha[j++];
        }

        return resultado;
    }

    // M�todo principal (main)
    public static void main(String[] args) {
        int[] numeros = {38, 27, 43, 3, 9, 82, 10};
        int[] ordenados = mergeSort(numeros);

        System.out.print("Lista ordenada: ");
        for (int num : ordenados) {
            System.out.print(num + " ");
        }
    }
}
