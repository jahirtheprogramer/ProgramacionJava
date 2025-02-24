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

public class EjercicioVeinte {
    Scanner scanner = new Scanner(System.in);
    private double temperatura;

    public EjercicioVeinte() {
    }

    public void verificarTemperatura() {
        do {
            System.out.println("Ingrese la temperatura actual (°C): ");
            temperatura = scanner.nextDouble();

            if (temperatura < 18 || temperatura > 25) {
                System.out.println(" Alerta: Temperatura fuera del rango aceptable (18°C - 25°C). Intente de nuevo.");
            }

        } while (temperatura < 18 || temperatura > 25);

        System.out.println("Temperatura aceptable registrada: " + temperatura + "°C.");
    }
}

