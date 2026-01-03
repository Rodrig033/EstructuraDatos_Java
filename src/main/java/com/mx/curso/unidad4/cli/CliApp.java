package com.mx.curso.unidad4.cli;

import com.mx.curso.unidad4.motor_medicion.Scenario;

import java.util.Scanner;

public class CliApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showWelcome();
        mainMenu();
    }

    private static void showWelcome() {
        System.out.println("========================================");
        System.out.println("   ALGORITHM PERFORMANCE LABORATORY");
        System.out.println("        Powered by NeuralNexus     ");
        System.out.println("========================================");
    }

    private static void mainMenu() {
        int option;
        do {
            System.out.println("\n1) Ejecutar nuevo experimento");
            System.out.println("0) Salir");
            System.out.print("Opción: ");

            option = scanner.nextInt();

            if (option == 1) {
                runExperimentFlow();
            }

        } while (option != 0);
    }
    private static Scenario selectScenario() {
        int option;

        while (true) {
            System.out.println("\nSeleccione el escenario de ejecución:");
            System.out.println("1) Mejor Caso");
            System.out.println("2) Caso Promedio");
            System.out.println("3) Peor Caso");
            System.out.print("Opción: ");

            if (!scanner.hasNextInt()) {
                scanner.next(); // descarta entrada inválida
                System.out.println("Entrada inválida. Intente nuevamente.");
                continue;
            }

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    return Scenario.BEST_CASE;
                case 2:
                    return Scenario.AVERAGE_CASE;
                case 3:
                    return Scenario.WORST_CASE;
                default:
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
            }
        }
    }

    private static void runExperimentFlow() {
        Scenario scenario = selectScenario();
        // Aquí después:
        // - seleccionar algoritmo
        // - seleccionar N
        // - seleccionar escenario
        // - llamar al ExperimentController
    }


}