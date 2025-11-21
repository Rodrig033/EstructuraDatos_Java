package com.mx.curso.poo;

public class Jugador {
    // Atributos
    private String nombre;
    private String apodo;
    private Integer edad;
    private Integer posicion_atp;

    // Contructor
    public Jugador(){
        System.out.println("El jugador ha ingresado a la liga ATP.");
    }

    // Metodos
    public void ascensoPosicion() {
        System.out.println("El jugador ha subido una posicion en la liga.");
    }

    // Main
    static void main(String[] args) {
        Jugador jugador = new Jugador();
        jugador.ascensoPosicion();
        jugador.setNombre("Jannik Sinner");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
