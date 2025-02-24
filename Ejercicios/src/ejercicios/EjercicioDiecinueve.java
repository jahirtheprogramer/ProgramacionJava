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

public class EjercicioDiecinueve {
    Scanner scanner = new Scanner(System.in);
    private double total = 0;
    private String continuar;

    public EjercicioDiecinueve() {
    }

    public void iniciarPedido() {
        mostrarMenu();
        realizarPedidos();
        mostrarTotal();
    }

    private void mostrarMenu() {
        System.out.println("====== MENÚ DE COMIDAS RÁPIDAS ======");
        System.out.println("1. Hamburguesa - $12.000");
        System.out.println("2. Perro Caliente - $10.000");
        System.out.println("3. Papas Fritas - $8.000");
        System.out.println("4. Gaseosa - $5.000");
        System.out.println("5. Finalizar pedido");
    }

    private void realizarPedidos() {
        do {
            System.out.println("Seleccione una opción del menú (1-5):");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea pendiente

            switch (opcion) {
                case 1:
                    total += 12000;
                    System.out.println("Hamburguesa añadida.");
                    break;
                case 2:
                    total += 10000;
                    System.out.println("Perro Caliente añadido.");
                    break;
                case 3:
                    total += 8000;
                    System.out.println("Papas Fritas añadidas.");
                    break;
                case 4:
                    total += 5000;
                    System.out.println("Gaseosa añadida.");
                    break;
                case 5:
                    System.out.println("Finalizando pedido...");
                    return; //salimos del metodo y no pedimos mas
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

            System.out.println("¿Desea pedir algo más? (si/no)");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));
    }

    private void mostrarTotal() {
        System.out.println("\nTotal a pagar: $" + total);
        System.out.println("Gracias por su compra. ¡Disfrute su comida!");
    }
}

