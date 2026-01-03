package com.mx.curso.unidad4.motor_medicion.algorithms;
import com.mx.curso.unidad4.motor_medicion.Algorithm;

public class QuickSortAlgorithm implements Algorithm<int[]> {

    @Override
    public void execute(int[] data) {
        if (data == null || data.length < 2) {
            return;
        }
        quickSort(data, 0, data.length - 1);
    }

    private void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);
            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    private int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);
        return i + 1;
    }

    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    @Override
    public String getName() {
        return "Quick Sort";
    }
}