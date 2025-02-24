/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class EjercicioVeinticuatro {
    private Scanner scanner;

    public EjercicioVeinticuatro() {
        scanner = new Scanner(System.in);
    }

    public void registrarVehiculos() {
        System.out.print("¿Cuántos vehículos ingresarán al parqueadero? ");
        int numVehiculos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        String resumen = ""; // Acumulador de texto para placas y horas de ingreso

        for (int i = 1; i <= numVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo #" + i + ": ");
            String placa = scanner.nextLine();

            System.out.print("Ingrese la hora de ingreso (HH:mm): ");
            String horaIngreso = scanner.nextLine();

            resumen += "Vehículo #" + i + " - Placa: " + placa + " - Hora de Ingreso: " + horaIngreso + "\n";
        }

        System.out.println("\nResumen de vehículos registrados:");
        System.out.println(resumen);
    }
}

