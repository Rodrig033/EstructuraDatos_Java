package com.mx.curso.unidad4.motor_medicion;

public interface DataGenerator<T> {
    T generate(int size, Scenario scenario);
}
