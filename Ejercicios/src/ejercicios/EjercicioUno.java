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

import java.util.Scanner;

public class EjercicioUno {

    private String nombreCliente;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private boolean esEstudiante;
    private char tipoCliente;

    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el producto que desea comprar: ");
        producto = scanner.nextLine();

        System.out.print("Ingrese la cantidad de productos: ");
        cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio unitario del producto: ");
        precioUnitario = scanner.nextDouble();

        System.out.print("¿El cliente es estudiante? (true/false): ");
        esEstudiante = scanner.nextBoolean();

        System.out.print("Ingrese el tipo de cliente (A, B, C, etc.): ");
        tipoCliente = scanner.next().charAt(0);
    }

    public void calcularFactura() {
        // Cálculo del subtotal
        double subtotal = cantidad * precioUnitario;

        // Cálculo del impuesto (13% si no es estudiante, 5% si es estudiante)
        double impuesto = esEstudiante ? (subtotal * 0.05) : (subtotal * 0.13);

        // Cálculo del total
        double total = subtotal + impuesto;

        // Mostrar la factura
        mostrarFactura(subtotal, impuesto, total);
    }

    public void mostrarFactura(double subtotal, double impuesto, double total) {
        System.out.println("\nFactura de Compra:");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total: $" + total);
        System.out.println("Tipo de cliente: " + tipoCliente);
    }

  
}
