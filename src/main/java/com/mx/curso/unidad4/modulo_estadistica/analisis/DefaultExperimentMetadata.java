package com.mx.curso.unidad4.modulo_estadistica.analisis;
import com.mx.curso.unidad4.motor_medicion.Scenario;

public class DefaultExperimentMetadata implements ExperimentMetadata {

    private final String algorithmName;
    private final int inputSize;
    private final Scenario scenario;

    public DefaultExperimentMetadata(
            String algorithmName,
            int inputSize,
            Scenario scenario
    ) {
        if (algorithmName == null || algorithmName.isBlank()) {
            throw new IllegalArgumentException(
                    "Algorithm name must not be null or empty."
            );
        }

        if (inputSize <= 0) {
            throw new IllegalArgumentException(
                    "Input size must be greater than zero."
            );
        }

        if (scenario == null) {
            throw new IllegalArgumentException(
                    "Scenario must not be null."
            );
        }

        this.algorithmName = algorithmName;
        this.inputSize = inputSize;
        this.scenario = scenario;
    }

    @Override
    public String getAlgorithmName() {
        return algorithmName;
    }

    @Override
    public int getInputSize() {
        return inputSize;
    }

    @Override
    public Scenario getScenario() {
        return scenario;
    }
}