/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intrusos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menu {
    private SistemadeSeguridad sistema;
    private Scanner scanner;

    public Menu() {
        sistema = new SistemadeSeguridad();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Seguridad ---");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Simular sensores");
            System.out.println("4. Cambiar estado del día");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistema.activarAlarma();
                    break;
                case 2:
                    sistema.desactivarAlarma();
                    break;
                case 3:
                    sistema.verificarSensores();
                    break;
                case 4:
                    System.out.print("Ingrese 1 si es de noche, 0 si es de día: ");
                    boolean esDeNoche = scanner.nextInt() == 1;
                    sistema.setEsDeNoche(esDeNoche);
                    System.out.println("Estado del día actualizado.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}