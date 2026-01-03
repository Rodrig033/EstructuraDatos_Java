package com.mx.curso.unidad4.motor_medicion.algorithms;
import com.mx.curso.unidad4.motor_medicion.Algorithm;

public class BubbleSortAlgorithm implements Algorithm<int[]> {

    @Override
    public void execute(int[] data) {
        if (data == null || data.length < 2) {
            return;
        }

        int n = data.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }
}