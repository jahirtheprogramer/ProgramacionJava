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


public class EjercicioVeinticinco {

    public void realizarCompra() {
        Scanner scanner = new Scanner(System.in);
        String productos = "";
        double totalCompra = 0.0;
        
        System.out.println("¿Cuántos productos deseas agregar al carrito?");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Producto " + i);
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            
            productos += nombre + " - " + precio + " COP\n";
            totalCompra += precio;
        }
        
        System.out.println("\nProductos en el carrito:");
        System.out.println(productos);
        System.out.println("Total de la compra: " + totalCompra + " COP");
    }
}

