package com.mx.curso.unidad4.red.social;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedSocial {

    private final Map<Usuario, List<Usuario>> adjencias = new HashMap<>(); // Creamos el mapa
    public void conectarAmigos(Usuario seguidor, Usuario seguido){
        if (!adjencias.containsKey(seguidor) || !adjencias.containsKey(seguido)){
            throw new IllegalArgumentException("Los usuarios no existen en la red social.");
        }

        adjencias.get(seguidor).add(seguido);

    }

    public void imprimirRed() {
        adjencias.forEach((usuario, amigos) -> {
            System.out.println(usuario.getNombre() +
                    " es amigo de: " + amigos);
        });
    }

    public void agregarUsuarios(Usuario usuario) {
        adjencias.putIfAbsent(usuario, new java.util.ArrayList<>());
    }

    public static void main(String[] args){
        RedSocial red = new RedSocial();

        // Crear nodos
        Usuario Ana = new Usuario("Ana", 1);
        Usuario Rafael = new Usuario("Rafael", 2);
        Usuario Fernanda = new Usuario("Fernanda", 3);
        Usuario Arad = new Usuario("Arad", 4);
        Usuario Valeria = new Usuario("Valeria", 5);

        // Registrar los nodos:
        red.agregarUsuarios(Ana);
        red.agregarUsuarios(Rafael);
        red.agregarUsuarios(Fernanda);
        red.agregarUsuarios(Arad);
        red.agregarUsuarios(Valeria);

        // Conexiones entre amigos:
        red.conectarAmigos(Fernanda, Arad);
        red.conectarAmigos(Arad, Fernanda);
        red.conectarAmigos(Arad, Valeria);
        red.conectarAmigos(Valeria, Arad);
        red.conectarAmigos(Valeria, Fernanda);

        // Imprimir las conexiones en la red social:
        red.imprimirRed();

    }};