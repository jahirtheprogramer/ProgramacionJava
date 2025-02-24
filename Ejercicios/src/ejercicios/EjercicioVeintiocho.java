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

public class EjercicioVeintiocho {
    private Scanner scanner;

    public EjercicioVeintiocho() {
        scanner = new Scanner(System.in);
    }

    public void registrarVentas() {
        System.out.print("¿Cuántos productos se vendieron? ");
        int cantidadVentas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        String resumenVentas = ""; // Acumulador de ventas
        double totalVentas = 0; // Total de las ventas

        for (int i = 1; i <= cantidadVentas; i++) {
            System.out.print("Ingrese el nombre del producto #" + i + ": ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto #" + i + ": ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad vendida del producto #" + i + ": ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            double totalProducto = precio * cantidad;
            resumenVentas += "Producto: " + producto + " - Precio: $" + precio + " - Cantidad: " + cantidad + " - Total: $" + totalProducto + "\n";
            totalVentas += totalProducto;
        }

        System.out.println("\nResumen de ventas:");
        System.out.println(resumenVentas);
        System.out.println("Total de ventas: $" + totalVentas);
    }
}

