package com.mx.curso.unidad4.modulo_estadistica.visualizacion;

import com.mx.curso.unidad4.modulo_estadistica.analisis.AnalyzedExperiment;
import java.util.List;

public interface ChartDataMapper {

    ChartData map(
            String title,
            String xAxisLabel,
            String yAxisLabel,
            List<AnalyzedExperiment> experiments
    );
}