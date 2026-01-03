package com.mx.curso.unidad4.motor_medicion;

public interface MeasurementResult {
    void addMeasurement(long time);
    double getAverageTime();
    int getSampleSize();
}
