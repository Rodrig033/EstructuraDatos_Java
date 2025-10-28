import java.util.Arrays;

public class seleccion {

    public static void main(String[] args) {
        // Lista con las puntuaciones de importancia
        int[] importancias = {75, 20, 55, 40, 90, 10, 60, 30};
        System.out.println("Características no ordenadas:");
        System.out.println(Arrays.toString(importancias));
        int n = importancias.length;
        //         Algoritmo de selección para ordenar de mayor a menor
        for (int i = 0; i < n; i++) {
            int maximo = i;
            for (int j = i + 1; j < n; j++) {
                if (importancias[j] > importancias[maximo]) {
                    maximo = j;
                }
            }
            // Intercambiar
            int temp = importancias[i];
            importancias[i] = importancias[maximo];
            importancias[maximo] = temp;
        }
        System.out.println("Características ordenadas por importancia (mayor a menor):");
        System.out.println(Arrays.toString(importancias));
    }
}
