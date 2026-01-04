package com.mx.curso.unidad4.application;

import com.mx.curso.unidad4.domain.AlgorithmType;
import com.mx.curso.unidad4.motor_medicion.Scenario;
import com.mx.curso.unidad4.modulo_estadistica.analisis.AnalyzedExperiment;

public interface ExperimentFacade {

    AnalyzedExperiment runExperiment(
            AlgorithmType algorithmType,
            int inputSize,
            Scenario scenario
    );
}