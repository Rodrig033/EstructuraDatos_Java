package com.mx.curso.unidad4.modulo_estadistica.analisis;

public class DefaultAnalysisResult implements AnalysisResult {

    private final double averageTime;
    private final int sampleSize;

    public DefaultAnalysisResult(double averageTime, int sampleSize) {
        if (sampleSize <= 0) {
            throw new IllegalArgumentException(
                    "El tamaño de la muestra debe ser mayor que cero."
            );
        }

        this.averageTime = averageTime;
        this.sampleSize = sampleSize;
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
