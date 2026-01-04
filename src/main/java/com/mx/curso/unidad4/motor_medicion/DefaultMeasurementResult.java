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
        return measurements.stream()
                .mapToLong(Long::longValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public int getSampleSize() {
        return measurements.size();
    }
}