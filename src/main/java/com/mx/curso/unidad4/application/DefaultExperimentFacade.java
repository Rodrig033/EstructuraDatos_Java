package com.mx.curso.unidad4.application;

import com.mx.curso.unidad4.domain.AlgorithmType;
import com.mx.curso.unidad4.motor_medicion.*;
import com.mx.curso.unidad4.motor_medicion.algorithms.*;
import com.mx.curso.unidad4.motor_medicion.generators.*;

public class DefaultExperimentFacade implements ExperimentFacade {

    private static final int DEFAULT_REPETITIONS = 5;
    private static final int DEFAULT_WARMUP_RUNS = 3;

    private final ExperimentController<int[]> controller;

    public DefaultExperimentFacade() {
        Timer timer = new NanoTimer();

        this.controller = new DefaultExperimentController<>(
                timer,
                DEFAULT_WARMUP_RUNS
        );
    }

    @Override
    public MeasurementResult runExperiment(
            AlgorithmType algorithmType,
            int inputSize,
            Scenario scenario
    ) {
        Algorithm<int[]> algorithm = resolveAlgorithm(algorithmType);
        DataGenerator<int[]> generator = resolveGenerator(scenario);

        return controller.runExperiment(
                algorithm,
                generator,
                inputSize,
                scenario,
                DEFAULT_REPETITIONS
        );
    }

    //  Resolución de dependencias

    private Algorithm<int[]> resolveAlgorithm(AlgorithmType type) {
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

    private DataGenerator<int[]> resolveGenerator(Scenario scenario) {
        switch (scenario) {
            case BEST_CASE:
                return new SortedArrayGenerator();
            case AVERAGE_CASE:
                return new RandomArrayGenerator();
            case WORST_CASE:
                return new ReverseSortedArrayGenerator();
            default:
                throw new IllegalArgumentException(
                        "Escenario no soportado: " + scenario
                );
        }
    }
}