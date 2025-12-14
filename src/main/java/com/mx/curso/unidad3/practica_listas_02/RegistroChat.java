package com.mx.curso.unidad3.practica_listas_02;


public class RegistroChat {

    public static void main(String[] args){

        ChatBot historial = new ChatBot();

        System.out.println("¡¡Bienvenido a NeuralNexus AI!!");
        historial.insertarFinalUser("Hola, tengo una duda.");
        historial.insertarFinalBot("Estoy aquí para ayudarte, ¿Cuál es tu duda?");
        historial.insertarFinalUser("¿Cómo hacer un pastel?");
        historial.insertarFinalBot("Excelente, necesitaras estos ingredientes...");

        historial.imprimirChat();

    }
}

