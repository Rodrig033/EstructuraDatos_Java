package com.mx.curso.unidad4.modulo_estadistica.visualizacion;

import com.mx.curso.unidad4.modulo_estadistica.analisis.AnalyzedExperiment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DefaultChartDataMapper implements ChartDataMapper {

    @Override
    public ChartData map(
            String title,
            String xAxisLabel,
            String yAxisLabel,
            List<AnalyzedExperiment> experiments
    ) {
        if (experiments == null || experiments.isEmpty()) {
            throw new IllegalArgumentException(
                    "La lista de experimentos no puede estar vacía."
            );
        }

        // Creamos una copia mutable para evitar errores con listas inmutables
        List<AnalyzedExperiment> mutableExperiments = new ArrayList<>(experiments);

        mutableExperiments.sort(
                Comparator.comparingInt(
                        e -> e.getMetadata().getInputSize()
                )
        );

        List<Integer> xValues = new ArrayList<>();
        List<Double> yValues = new ArrayList<>();

        for (AnalyzedExperiment exp : mutableExperiments) {
            xValues.add(exp.getMetadata().getInputSize());
            yValues.add(exp.getAnalysisResult().getAverageTime());
        }

        return new DefaultChartData(
                title,
                xAxisLabel,
                yAxisLabel,
                xValues,
                yValues
        );
    }
}