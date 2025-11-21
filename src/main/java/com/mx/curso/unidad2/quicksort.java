package com.mx.curso.unidad2;

public class quicksort {

    // Método principal QuickSort
    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arr, inicio, fin);
            quickSort(arr, inicio, pivote - 1); // Subarreglo izquierdo
            quickSort(arr, pivote + 1, fin);    // Subarreglo derecho
        }
    }

    // Método para particionar el arreglo
    public static int particion(int[] arr, int inicio, int fin) {
        int pivot = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Colocamos el pivote en su posición correcta
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 7, 0, 10, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Arreglo ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
