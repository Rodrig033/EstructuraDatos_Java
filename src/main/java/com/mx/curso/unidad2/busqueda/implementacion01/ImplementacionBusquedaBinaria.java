import com.mx.curso.unidad2.busqueda2.Binaria;
import com.mx.curso.unidad2.insertion;

void main() {

    int[] numerosFijos = {
            10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
            30, 31, 32, 33, 999, 35, 36, 37, 38, 39,
            41110, 41, 42, 43, 44, 45, 46, 47, 48, 49,
            410, 141, 42, 43, 44, 45, 46, 47, 48, 49,
            40, 41, 112, 43, 44, 15, 46, 47, 48, 49,
            410, 41, 42, 43, 34, 25, 46, 47, 48, 49,
            400, 41, 42, 43, 44, 335, 46, 47, 48, 49,
            150, 151, 152, 153, 154, 155, 156, 157, 158, 159
    };

    long startTime = System.nanoTime();

    insertion.Burbuja.bubbleSort(numerosFijos);

    int elementoABuscar = 999;

    int indice = Binaria.busquedaBinaria(numerosFijos, elementoABuscar);

    if (indice == -1) {
        System.out.println("Elemento no encontrado");
    } else {
        System.out.println("Elemento encontrado en el indice: " + indice);
    }

    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println(duration + " nanosegundos");

}
