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

public class EjercicioVeintisiete {
    private Scanner scanner;

    public EjercicioVeintisiete() {
        scanner = new Scanner(System.in);
    }

    public void sumarNumeros() {
        System.out.print("¿Cuántos números desea ingresar? ");
        int cantidadNumeros = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            double numero = scanner.nextDouble();

            suma += numero;
        }

        System.out.println("\nLa suma total de los números ingresados es: " + suma);
    }
}

