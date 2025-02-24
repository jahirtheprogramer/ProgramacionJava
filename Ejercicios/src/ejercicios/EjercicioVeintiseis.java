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

public class EjercicioVeintiseis {

    public void gestionarContactos() {
        Scanner scanner = new Scanner(System.in);
        String agenda = "";
        
        System.out.println("¿Cuántos contactos deseas agregar a la agenda?");
        int cantidadContactos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= cantidadContactos; i++) {
            System.out.println("Contacto " + i);
            System.out.print("Nombre del contacto: ");
            String nombre = scanner.nextLine();
            System.out.print("Número de teléfono: ");
            String telefono = scanner.nextLine();
            
            agenda += "Nombre: " + nombre + " - Teléfono: " + telefono + "\n";
        }
        
        System.out.println("\nAgenda de contactos:");
        System.out.println(agenda);
    }
}
