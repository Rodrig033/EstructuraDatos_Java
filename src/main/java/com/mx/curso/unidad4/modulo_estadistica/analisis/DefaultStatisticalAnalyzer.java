package com.mx.curso.unidad4.modulo_estadistica.analisis;


import com.mx.curso.unidad4.motor_medicion.MeasurementResult;

public class DefaultStatisticalAnalyzer implements StatisticalAnalyzer {

    @Override
    public AnalysisResult analyze(MeasurementResult measurementResult) {

        if (measurementResult == null) {
            throw new IllegalArgumentException(
                    "MeasurementResult no puede ser null."
            );
        }

        double averageTime = measurementResult.getAverageTime();
        int sampleSize = measurementResult.getSampleSize();

        return new DefaultAnalysisResult(averageTime, sampleSize);
    }
}