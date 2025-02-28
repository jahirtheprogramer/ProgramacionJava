
package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine("Cine XYZ");
        Sala sala1 = new Sala(1, 10);  // Sala con 10 asientos
        cine.agregarSala(sala1);

        System.out.println("¡Bienvenido al sistema de reservas de " + cine.getNombre() + "!");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        Usuario usuario = new Usuario(nombre, 1);

        while (sala1.hayAsientosDisponibles()) {
            sala1.mostrarAsientosDisponibles();
            System.out.print("Seleccione un asiento a reservar (1-10) o 0 para salir: ");
            int numAsiento = scanner.nextInt();

            if (numAsiento == 0) {
                System.out.println("Saliendo del sistema...");
                break;
            }

            sala1.reservarAsiento(numAsiento);
        }

        System.out.println("No hay más asientos disponibles. ¡Gracias por su reserva!");
        scanner.close();
    }
}

