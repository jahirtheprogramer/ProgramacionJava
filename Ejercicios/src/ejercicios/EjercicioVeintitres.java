/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

public class EjercicioVeintitres {
    private Scanner scanner;
    private String ventasRegistradas;
    private double totalVentas;

    public EjercicioVeintitres() {
        scanner = new Scanner(System.in);
        ventasRegistradas = ""; 
        totalVentas = 0; 
    }
    
    public void registrarVentas() {
        ingresarVentas();
        mostrarResumen();
    }

    private void ingresarVentas() {
        String respuesta;
        do {
            System.out.print(" Ingresa el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print(" Ingresa el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            ventasRegistradas += "️ " + producto + " - 💲" + precio + "\n";
            totalVentas += precio;

            System.out.print("¿Deseas registrar otra venta? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("si"));
    }

    private void mostrarResumen() {
        System.out.println("\n Resumen de Ventas:");
        if (ventasRegistradas.isEmpty()) {
            System.out.println("️ No se registraron ventas.");
        } else {
            System.out.println(ventasRegistradas);
            System.out.println(" Total de Ventas: $" + totalVentas);
        }
    }
}

