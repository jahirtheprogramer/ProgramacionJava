
package ejercicios;
import java.util.Scanner;


/**
 *
 * @author SENA
 */
public class Ejercicios {

    

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
int opcion;

do {
    System.out.println("\n=== MENÚ ===");
    System.out.println("1. Opción 1");
    System.out.println("2. Opción 2");
    System.out.println("3. Opción 3");
    System.out.println("4. Opción 4");
    System.out.println("5. Opción 5");
    System.out.println("6. Opción 6");
    System.out.println("6. Opción 7");
    System.out.println("6. Opción 8");
    System.out.println("6. Opción 9");
    System.out.println("6. Opción 10");
    System.out.println("6. Opción 11");
    System.out.println("6. Opción 12");
    System.out.println("6. Opción 13");


    System.out.println("15. Salir");
    System.out.print("Seleccione una opción: ");
    opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
             
            break;
        case 2:
            EjercicioDos objdos= new EjercicioDos();
         objdos.tomarDatos();
            break;
        // Más casos según las opciones del menú
        case 3:
          EjercicioTres objtres= new EjercicioTres();
         objtres.tomarDatos();
            break;
        case 4:
            EjercicioCuatro objCuatro= new EjercicioCuatro();
            objCuatro.tomarDatos();
            break;
        case 5:
            EjercicioCinco objCinco = new EjercicioCinco();
            objCinco.tomarDatos();
            break;
        case 6:
            EjercicioSeis objSeis = new EjercicioSeis();
            objSeis.tomarDatos();
            break;
        case 7:
            
        default:
            System.out.println("Opción inválida.");
            break;
    }
} while (opcion != 15);

scanner.close();

        
   
       
        
        
    }
    
}
