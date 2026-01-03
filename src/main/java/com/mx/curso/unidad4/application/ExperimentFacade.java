package com.mx.curso.unidad4.application;

import com.mx.curso.unidad4.domain.AlgorithmType;
import com.mx.curso.unidad4.motor_medicion.MeasurementResult;
import com.mx.curso.unidad4.motor_medicion.Scenario;

public interface ExperimentFacade {

    MeasurementResult runExperiment(
            AlgorithmType algorithmType,
            int inputSize,
            Scenario scenario
    );
}