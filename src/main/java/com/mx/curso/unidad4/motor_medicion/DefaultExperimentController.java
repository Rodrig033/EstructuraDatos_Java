package com.mx.curso.unidad4.motor_medicion;

public class DefaultExperimentController<T> implements ExperimentController<T> {

    private final Timer timer;
    private final int warmUpRuns;

    public DefaultExperimentController(Timer timer, int warmUpRuns) {
        this.timer = timer;
        this.warmUpRuns = warmUpRuns;
    }

    @Override
    public MeasurementResult runExperiment(
            Algorithm<T> algorithm,
            DataGenerator<T> generator,
            int size,
            Scenario scenario,
            int repetitions
    ) {

        // Warm-up (JIT optimization)
        for (int i = 0; i < warmUpRuns; i++) {
            T data = generator.generate(size, scenario);
            algorithm.execute(data);
        }

        MeasurementResult result = new DefaultMeasurementResult();

        // Actual measurement
        for (int i = 0; i < repetitions; i++) {
            T data = generator.generate(size, scenario);

            timer.start();
            algorithm.execute(data);
            timer.stop();

            result.addMeasurement(timer.getElapsedTime());
        }

        return result;
    }
}
