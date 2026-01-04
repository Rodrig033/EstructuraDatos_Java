package com.mx.curso.unidad4.motor_medicion.generators;
import com.mx.curso.unidad4.motor_medicion.DataGenerator;
import com.mx.curso.unidad4.motor_medicion.Scenario;
import java.util.Random;

// Genera arrays en orden descendente:

public class ReverseSortedArrayGenerator implements DataGenerator<int[]> {

    private final Random random = new Random();

    @Override
    public int[] generate(int size, Scenario scenario) {
        int[] data = new int[size];

        switch (scenario) {
            case BEST_CASE:
                // Sorted ascending
                for (int i = 0; i < size; i++) {
                    data[i] = i;
                }
                break;

            case AVERAGE_CASE:
                // Random values
                for (int i = 0; i < size; i++) {
                    data[i] = random.nextInt(size);
                }
                break;

            case WORST_CASE:
                // Sorted descending
                for (int i = 0; i < size; i++) {
                    data[i] = size - i;
                }
                break;
        }

        return data;
    }
}