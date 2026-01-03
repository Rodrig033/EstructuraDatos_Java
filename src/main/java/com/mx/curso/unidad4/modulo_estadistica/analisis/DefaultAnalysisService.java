package com.mx.curso.unidad4.modulo_estadistica.analisis;

import com.mx.curso.unidad4.motor_medicion.MeasurementResult;

public class DefaultAnalysisService implements AnalysisService {

    @Override
    public AnalysisResult analyze(MeasurementResult result) {

        return new DefaultAnalysisResult(
                result.getAverageTime(),
                result.getSampleSize()
        );
    }
}