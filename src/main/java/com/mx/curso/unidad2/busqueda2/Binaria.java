package com.mx.curso.unidad2.busqueda2;
import com.mx.curso.unidad2.insertion;

public class Binaria {

    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == x) {
                return medio;
            }

            if (arr[medio] < x) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] datos ={5,6,7,1,5,8,9,10};
        int elementoBuscar =1;

        insertion.Burbuja.bubbleSort(datos);

        int indice = busquedaBinaria(datos, elementoBuscar);

        if (indice == -1){
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("Elemento encontrado en el indice: " + indice);
        }

    }

}
