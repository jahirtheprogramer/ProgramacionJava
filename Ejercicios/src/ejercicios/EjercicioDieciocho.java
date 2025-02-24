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

public class EjercicioDieciocho {
    Scanner scanner = new Scanner(System.in);
    private String registros = "";
    private String continuar;

    public EjercicioDieciocho() {
    }

    public void iniciarRegistro() {
        registrarLibros();
        mostrarRegistros();
    }

    private void registrarLibros() {
        do {
            System.out.println("Ingrese el título del libro:");
            String titulo = scanner.nextLine();

            System.out.println("Ingrese el autor del libro:");
            String autor = scanner.nextLine();

            System.out.println("Ingrese el número de páginas:");
            int paginas = scanner.nextInt();
            scanner.nextLine(); 

            registros += "Título: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas + "\n";

            System.out.println("¿Desea registrar otro libro? (si/no)");
            continuar = scanner.nextLine();
            
        } while (continuar.equalsIgnoreCase("si"));
    }

    private void mostrarRegistros() {
        System.out.println("\nLista de libros registrados:");
       System.out.println(registros);

    }
}

