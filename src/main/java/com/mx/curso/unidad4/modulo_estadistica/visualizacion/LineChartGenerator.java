package com.mx.curso.unidad4.modulo_estadistica.visualizacion;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

import java.io.File;

// Generador de gráficos de línea seguro para producción.
// Crea automáticamente las carpetas necesarias antes de guardar el gráfico.

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
            // Asegurarse de que la carpeta exista
            File file = new File(outputPath);
            File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs(); // crea la carpeta y padres si no existen
            }

            // Guardar el gráfico
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