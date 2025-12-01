package com.mx.curso.unidad2.busqueda2;

public class Secuencial {
    public static int busquedaSecuencial(int [] arr, int x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] datos ={5,6,7,1,5,8,9,10};
        int elementoBuscar =1;
        int indice = busquedaSecuencial(datos, elementoBuscar);

        if (indice == -1){
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("Elemento encontrado en el indice: " + indice);
        }

    }

}
