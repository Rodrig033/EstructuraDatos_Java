package com.mx.curso.unidad4.modulo_estadistica.visualizacion;
import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

public class LineChartGenerator implements ChartGenerator {

    @Override
    public void generate(ChartData data, String outputPath) {
        XYChart chart = new XYChartBuilder()
                .title(data.getTitle())
                .xAxisTitle(data.getxAxisLabel())
                .yAxisTitle(data.getyAxisLabel())
                .build();

        chart.addSeries(
                "Resultados",
                data.getXValues(),
                data.getYValues()
        );

        try {
            BitmapEncoder.saveBitmap(
                    chart,
                    outputPath,
                    BitmapEncoder.BitmapFormat.PNG
            );
        } catch (Exception e) {
            throw new RuntimeException(
                    "Error al generar el gráfico de líneas.", e
            );
        }
    }
}