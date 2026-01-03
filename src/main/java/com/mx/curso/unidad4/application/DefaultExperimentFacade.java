package com.mx.curso.unidad4.application;

import com.mx.curso.unidad4.domain.AlgorithmType;
import com.mx.curso.unidad4.motor_medicion.*;
import com.mx.curso.unidad4.motor_medicion.algorithms.*;
import com.mx.curso.unidad4.motor_medicion.generators.*;
import com.mx.curso.unidad4.modulo_estadistica.analisis.*;

public class DefaultExperimentFacade implements ExperimentFacade {

    private static final int DEFAULT_REPETITIONS = 5;

    private final ExperimentController<int[]> controller;
    private final AnalysisService analysisService;

    public DefaultExperimentFacade() {
        Timer timer = new NanoTimer();
        this.controller = new DefaultExperimentController<>(timer, 3);
        this.analysisService = new DefaultAnalysisService();
    }

    @Override
    public AnalyzedExperiment runExperiment(
            AlgorithmType algorithmType,
            int inputSize,
            Scenario scenario
    ) {
        Algorithm<int[]> algorithm = resolveAlgorithm(algorithmType);
        DataGenerator<int[]> generator = resolveGenerator(scenario);

        // 1️⃣ Medición
        MeasurementResult measurementResult =
                controller.runExperiment(
                        algorithm,
                        generator,
                        inputSize,
                        scenario,
                        DEFAULT_REPETITIONS
                );

        // 2️⃣ Análisis
        AnalysisResult analysisResult =
                analysisService.analyze(measurementResult);

        // 3️⃣ Metadata
        ExperimentMetadata metadata =
                new DefaultExperimentMetadata(
                        algorithmType.name(),
                        inputSize,
                        scenario
                );

        // 4️⃣ Resultado final de alto nivel
        return new DefaultAnalyzedExperiment(
                metadata,
                analysisResult
        );
    }

    // ---------------- Factories internas ----------------

    private Algorithm<int[]> resolveAlgorithm(AlgorithmType type) {
        return switch (type) {
            case BUBBLE_SORT -> new BubbleSortAlgorithm();
            case QUICK_SORT -> new QuickSortAlgorithm();
            case LINEAR_SEARCH -> new LinearSearchAlgorithm();
            case BINARY_SEARCH -> new BinarySearchAlgorithm();
        };
    }

    private DataGenerator<int[]> resolveGenerator(Scenario scenario) {
        return switch (scenario) {
            case BEST_CASE -> new SortedArrayGenerator();
            case AVERAGE_CASE -> new RandomArrayGenerator();
            case WORST_CASE -> new ReverseSortedArrayGenerator();
        };
    }
}