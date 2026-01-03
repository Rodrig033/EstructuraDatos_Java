package com.mx.curso.unidad4.modulo_estadistica.analisis;
import com.mx.curso.unidad4.motor_medicion.Scenario;

public interface ExperimentMetadata {
    String getAlgorithmName();
    int getInputSize();
    Scenario getScenario();
}

