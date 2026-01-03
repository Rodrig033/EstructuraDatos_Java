package com.mx.curso.unidad4.application;

import com.mx.curso.unidad4.domain.AlgorithmType;
import com.mx.curso.unidad4.motor_medicion.*;
import com.mx.curso.unidad4.motor_medicion.algorithms.*;
import com.mx.curso.unidad4.motor_medicion.generators.*;

public class DefaultExperimentFacade implements ExperimentFacade {

    private static final int DEFAULT_REPETITIONS = 5;

    private final ExperimentController<Integer> controller;

    public DefaultExperimentFacade() {
        this.controller = new DefaultExperimentController<>();
    }

    @Override
    public void runExperiment(
            AlgorithmType algorithmType,
            int inputSize,
            Scenario scenario
    ) {
        Algorithm<Integer> algorithm = resolveAlgorithm(algorithmType);
        DataGenerator<Integer> generator = resolveGenerator(scenario);

        controller.runExperiment(
                algorithm,
                generator,
                inputSize,
                scenario,
                DEFAULT_REPETITIONS
        );
    }

    // Resolución de dependencias

    private Algorithm<Integer> resolveAlgorithm(AlgorithmType type) {
        switch (type) {
            case BUBBLE_SORT:
                return new BubbleSortAlgorithm();
            case QUICK_SORT:
                return new QuickSortAlgorithm();
            case LINEAR_SEARCH:
                return new LinearSearchAlgorithm();
            case BINARY_SEARCH:
                return new BinarySearchAlgorithm();
            default:
                throw new IllegalArgumentException(
                        "Algoritmo no soportado: " + type
                );
        }
    }

    private DataGenerator<Integer> resolveGenerator(Scenario scenario) {
        switch (scenario) {
            case BEST_CASE:
                return new BestCaseIntGenerator();
            case AVERAGE_CASE:
                return new RandomIntGenerator();
            case WORST_CASE:
                return new WorstCaseIntGenerator();
            default:
                throw new IllegalArgumentException(
                        "Escenario no soportado: " + scenario
                );
        }
    }
}