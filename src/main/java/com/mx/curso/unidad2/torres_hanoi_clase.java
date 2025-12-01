package com.mx.curso.unidad2;

public class torres_hanoi_clase {

    // Método recursivo para resolver el problema
    public static void resolverTorres(int n, char origen, char destino, char auxiliar) {
        // Caso Base: Si solo queda un disco, muévelo directamente
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        // Caso Recursivo:
        // 1. Mover n-1 discos del origen al poste auxiliar
        resolverTorres(n - 1, origen, auxiliar, destino);

        // 2. Mover el disco más grande del origen al destino
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // 3. Mover los n-1 discos del auxiliar al destino
        resolverTorres(n - 1, auxiliar, destino, origen);
    }

    public static void main(String[] args) {
        int numeroDeDiscos = 5; // Número de discos
        char posteOrigen = 'A';  // Poste de origen
        char posteAuxiliar = 'B'; // Poste auxiliar
        char posteDestino = 'C';  // Poste de destino

        System.out.println("Secuencia de movimientos para " + numeroDeDiscos + " discos:");

        resolverTorres(numeroDeDiscos, posteOrigen, posteDestino, posteAuxiliar);
    }
}