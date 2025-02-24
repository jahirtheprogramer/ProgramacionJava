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

public class EjercicioVeintidos {
    private Scanner scanner;
    private String tareasRegistradas;

    public EjercicioVeintidos() {
        scanner = new Scanner(System.in);
        tareasRegistradas = ""; // Acumulador de texto para almacenar tareas
    }

    public void gestionarTareas() {
        ingresarTareas();
        mostrarTareas();
    }

    private void ingresarTareas() {
        String respuesta;
        do {
            System.out.print(" Ingresa el nombre de la tarea: ");
            String nombreTarea = scanner.nextLine();

            System.out.print(" Ingresa la fecha de vencimiento (dd/mm/yyyy): ");
            String fechaVencimiento = scanner.nextLine();

            tareasRegistradas += "tarea " + nombreTarea + " - ️ Vence el: " + fechaVencimiento + "\n";

            System.out.print("¿Deseas agregar otra tarea? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("si"));
    }

    private void mostrarTareas() {
        System.out.println("\n Lista de tareas registradas:");
        if (tareasRegistradas.isEmpty()) {
            System.out.println("️ No se registraron tareas.");
        } else {
            System.out.println(tareasRegistradas);
        }
    }
}

