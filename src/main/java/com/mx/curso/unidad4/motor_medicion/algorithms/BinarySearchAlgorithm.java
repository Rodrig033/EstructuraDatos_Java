package com.mx.curso.unidad4.motor_medicion.algorithms;
import com.mx.curso.unidad4.motor_medicion.Algorithm;

public class BinarySearchAlgorithm implements Algorithm<int[]> {

    @Override
    public void execute(int[] data) {
        if (data == null || data.length == 0) {
            return;
        }

        int target = data[0];
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (data[mid] == target) {
                return;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    @Override
    public String getName() {
        return "Binary Search";
    }
}