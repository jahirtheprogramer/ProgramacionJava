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

public class EjercicioVeintiuno {
    Scanner scanner = new Scanner(System.in);
    private double sumaNotas = 0;
    private int cantidadNotas = 0;
    private String continuar;

    public EjercicioVeintiuno() {
    }

    public void calcularPromedio() {
        do {
            System.out.println("Ingrese la calificación del examen: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea

            sumaNotas += nota;
            cantidadNotas++;

            System.out.println("¿Desea ingresar otra nota? (si/no)");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        double promedio = (cantidadNotas > 0) ?  sumaNotas / cantidadNotas : 0;
        System.out.println("\n Promedio final: " + promedio);
        System.out.println(promedio >= 60 ? " Aprobado." : " Reprobado.");
    }
}
