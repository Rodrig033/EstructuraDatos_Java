package com.mx.curso.unidad4.modulo_estadistica.analisis;

public class DefaultAnalyzedExperiment implements AnalyzedExperiment {

    private final ExperimentMetadata metadata;
    private final AnalysisResult analysisResult;

    public DefaultAnalyzedExperiment(
            ExperimentMetadata metadata,
            AnalysisResult analysisResult
    ) {
        if (metadata == null) {
            throw new IllegalArgumentException(
                    "Experiment metadata no debe de ser null."
            );
        }

        if (analysisResult == null) {
            throw new IllegalArgumentException(
                    "Analysis result no debe de ser null."
            );
        }

        this.metadata = metadata;
        this.analysisResult = analysisResult;
    }

    @Override
    public ExperimentMetadata getMetadata() {
        return metadata;
    }

    @Override
    public AnalysisResult getAnalysisResult() {
        return analysisResult;
    }
}