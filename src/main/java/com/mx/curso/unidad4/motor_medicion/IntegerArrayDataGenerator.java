package com.mx.curso.unidad4.motor_medicion;
import java.util.Random;

public class IntegerArrayDataGenerator implements DataGenerator<int[]> {

    private final Random random = new Random();

    @Override
    public int[] generate(int size, Scenario scenario) {
        int[] data = new int[size];

        switch (scenario) {
            case BEST_CASE -> generateBestCase(data);
            case AVERAGE_CASE -> generateAverageCase(data);
            case WORST_CASE -> generateWorstCase(data);
        }

        return data;
    }

    private void generateBestCase(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
    }

    private void generateAverageCase(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt();
        }
    }

    private void generateWorstCase(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data.length - i;
        }
    }
}
