
package ejercicios;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;


public class EjercicioQuince {
    Scanner scanner = new Scanner(System.in);
    private double distancia;
    private double velocidad;
    private double tiempo;
    private int eleccion;
    private int finalizar;

    public EjercicioQuince() {
        
    }

    public void pedirDatos() {
        System.out.println("Hola, soy un simulador de viaje en coche.");
        simularViaje();
    }

    public void simularViaje() {
        while(finalizar != 3) {
            System.out.println("1. Ingresar datos de viaje, 2. Ver tiempo estimado, 3. Finalizar");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Ingrese la distancia total del viaje (en km): ");
                    distancia = scanner.nextDouble();
                    System.out.println("Ingrese la velocidad promedio del coche (en km/h): ");
                    velocidad = scanner.nextDouble();
                    
                    if (distancia <= 0 || velocidad <= 0) {
                        System.out.println("Error, la distancia y la velocidad deben ser mayores que 0.");
                    } else {
                        // Calcular el tiempo de viaje
                        tiempo = distancia / velocidad;
                        System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas.");
                    }
                    break;

                case 2:
                    if (tiempo == 0) {
                        System.out.println("Aún no se ha calculado un tiempo de viaje.");
                    } else {
                        System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas.");
                    }
                    break;

                case 3:
                    System.out.println("Finalizando el programa...");
                    finalizar = 3;
                    break;

                default:
                    System.out.println("Por favor, ingresa una opción válida.");
                    break;
            }
        }
    }

  
}
