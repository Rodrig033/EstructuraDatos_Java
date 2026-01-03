package com.mx.curso.unidad4.modulo_estadistica.analisis;
import com.mx.curso.unidad4.motor_medicion.MeasurementResult;

public interface StatisticalAnalyzer {
    AnalysisResult analyze(MeasurementResult measurementResult);
}
