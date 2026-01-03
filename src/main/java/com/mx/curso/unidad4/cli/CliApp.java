package com.mx.curso.unidad4.cli;

import com.mx.curso.unidad4.application.ExperimentFacade;
import com.mx.curso.unidad4.application.DefaultExperimentFacade;
import com.mx.curso.unidad4.motor_medicion.Scenario;
import java.util.Scanner;
import com.mx.curso.unidad4.domain.AlgorithmType;


public class CliApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showWelcome();
        mainMenu();
    }

    // Mensaje de bienvenida
    private static void showWelcome() {
        System.out.println("========================================");
        System.out.println("   ALGORITHM PERFORMANCE LABORATORY");
        System.out.println("        Powered by NeuralNexus     ");
        System.out.println("========================================");
    }

    // Menú inicial
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
    // Aquí se selecciona el escenario
    private static Scenario selectScenario() {
        int option;

        while (true) {
            System.out.println("\nSeleccione el escenario de ejecución:");
            System.out.println("1) Mejor Caso");
            System.out.println("2) Caso Promedio");
            System.out.println("3) Peor Caso");
            System.out.print("Opción: ");

            if (!scanner.hasNextInt()) {
                scanner.next(); //  input inválida
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

    // Selección de algoritmo
    private static AlgorithmType selectAlgorithm() {
        int option;

        while (true) {
            System.out.println("\nSeleccione el algoritmo a evaluar:");
            System.out.println("1) Burbuja (O(n²))");
            System.out.println("2) QuickSort (O(n log n))");
            System.out.println("3) Búsqueda Secuencial (O(n))");
            System.out.println("4) Búsqueda Binaria (O(log n))");
            System.out.print("Opción: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Entrada inválida. Intente nuevamente.");
                continue;
            }

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    return AlgorithmType.BUBBLE_SORT;
                case 2:
                    return AlgorithmType.QUICK_SORT;
                case 3:
                    return AlgorithmType.LINEAR_SEARCH;
                case 4:
                    return AlgorithmType.BINARY_SEARCH;
                default:
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
            }
        }
    }

    // Selección del tamaño de la entrada
    private static int selectInputSize() {
        int option;

        while (true) {
            System.out.println("\nSeleccione el tamaño de entrada (N):");
            System.out.println("1) 1,000   (10³)");
            System.out.println("2) 10,000  (10⁴)");
            System.out.println("3) 100,000 (10⁵)");
            System.out.println("4) 1,000,000 (10⁶)");
            System.out.print("Opción: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Entrada inválida. Intente nuevamente.");
                continue;
            }

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    return 1_000;
                case 2:
                    return 10_000;
                case 3:
                    return 100_000;
                case 4:
                    return 1_000_000;
                default:
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
            }
        }
    }

    // Confirmación del experimento
    private static boolean confirmExperiment(
            AlgorithmType algorithm,
            int inputSize,
            Scenario scenario
    ) {
        int option;

        while (true) {
            System.out.println("\nResumen del experimento:");
            System.out.println("Algoritmo: " + algorithm);
            System.out.println("Tamaño de entrada (N): " + inputSize);
            System.out.println("Escenario: " + scenario);
            System.out.println("\n¿Desea ejecutar el experimento?");
            System.out.println("1) Sí");
            System.out.println("0) Cancelar");
            System.out.print("Opción: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Entrada inválida. Intente nuevamente.");
                continue;
            }

            option = scanner.nextInt();

            if (option == 1) return true;
            if (option == 0) return false;

            System.out.println("Opción fuera de rango.");
        }
    }


    // Corremos el experimento
    private static void runExperimentFlow() {
        AlgorithmType algorithm = selectAlgorithm();
        int inputSize = selectInputSize();
        Scenario scenario = selectScenario();
        boolean confirmed = confirmExperiment(
                algorithm,
                inputSize,
                scenario
        );

        if (!confirmed) {
            System.out.println("Experimento cancelado.");
            return;
        }

        System.out.println("\nEjecutando experimento...");

        ExperimentFacade facade =
                new DefaultExperimentFacade();

        facade.runExperiment(
                algorithm,
                inputSize,
                scenario
        );

        System.out.println("Experimento finalizado.");
    }


}