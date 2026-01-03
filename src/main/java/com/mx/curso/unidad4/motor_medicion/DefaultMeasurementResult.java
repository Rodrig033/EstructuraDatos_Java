package com.mx.curso.unidad4.motor_medicion;

import java.util.ArrayList;
import java.util.List;

public class DefaultMeasurementResult implements MeasurementResult {

    private final List<Long> measurements = new ArrayList<>();

    @Override
    public void addMeasurement(long time) {
        measurements.add(time);
    }

    @Override
    public double getAverageTime() {
        if (measurements.isEmpty()) {
            return 0.0;
        }
        long sum = 0;
        for (long t : measurements) {
            sum += t;
        }
        return (double) sum / measurements.size();
    }

    @Override
    public int getSampleSize() {
        return measurements.size();
    }

    public List<Long> getRawMeasurements() {
        return List.copyOf(measurements);
    }
}