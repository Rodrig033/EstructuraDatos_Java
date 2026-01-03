package com.mx.curso.unidad4.motor_medicion;

public class NanoTimer implements Timer {

    private long startTime;
    private long endTime;
    private boolean running;

    @Override
    public void start() {
        running = true;
        startTime = System.nanoTime();
    }

    @Override
    public void stop() {
        if (!running) {
            throw new IllegalStateException("El temporizador no se inició");
        }
        endTime = System.nanoTime();
        running = false;
    }

    @Override
    public long getElapsedTime() {
        if (running) {
            throw new IllegalStateException("El temporizador sigue funcionando");
        }
        return endTime - startTime;
    }
}
