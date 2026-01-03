package com.mx.curso.unidad4.modulo_estadistica.visualizacion;

import java.util.Collections;
import java.util.List;

public class DefaultChartData implements ChartData {

    private final String title;
    private final String xAxisLabel;
    private final String yAxisLabel;
    private final List<Integer> xValues;
    private final List<Double> yValues;

    public DefaultChartData(
            String title,
            String xAxisLabel,
            String yAxisLabel,
            List<Integer> xValues,
            List<Double> yValues
    ) {
        if (xValues.size() != yValues.size()) {
            throw new IllegalArgumentException(
                    "Los valores X e Y deben tener el mismo tamaño."
            );
        }

        this.title = title;
        this.xAxisLabel = xAxisLabel;
        this.yAxisLabel = yAxisLabel;
        this.xValues = List.copyOf(xValues);
        this.yValues = List.copyOf(yValues);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getxAxisLabel() {
        return xAxisLabel;
    }

    @Override
    public String getyAxisLabel() {
        return yAxisLabel;
    }

    @Override
    public List<Integer> getXValues() {
        return Collections.unmodifiableList(xValues);
    }

    @Override
    public List<Double> getYValues() {
        return Collections.unmodifiableList(yValues);
    }
}