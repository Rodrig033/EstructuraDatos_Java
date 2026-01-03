package com.mx.curso.unidad4.motor_medicion;

public class FakeMeasurementResult implements MeasurementResult {

    private final double averageTime;
    private final int sampleSize;

    public FakeMeasurementResult(double averageTime, int sampleSize) {
        this.averageTime = averageTime;
        this.sampleSize = sampleSize;
    }

    @Override
    public void addMeasurement(long time) {
        // No-op: método intencionalmente vacío
        // Este Fake simula un resultado ya calculado
    }

    @Override
    public double getAverageTime() {
        return averageTime;
    }

    @Override
    public int getSampleSize() {
        return sampleSize;
    }
}