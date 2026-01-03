package com.mx.curso.unidad4.motor_medicion;

public interface Algorithm<T> {
    void execute(T data);
    String getName();
}
