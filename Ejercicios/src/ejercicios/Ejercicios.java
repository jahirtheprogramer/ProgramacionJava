
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
    System.out.println("7. Opción 7");
    System.out.println("8. Opción 8");
    System.out.println("9. Opción 9");
    System.out.println("10. Opción 10");
    System.out.println("11. Opción 11");
    System.out.println("12. Opción 12");
    System.out.println("13. Opción 13");
    System.out.println("14. Opción 14");
    System.out.println("15. Opción 15");
    System.out.println("16. Opción 16");
    System.out.println("17. Opción 17");
    System.out.println("18. Opción 18");
    System.out.println("19. Opción 19");
    System.out.println("20. Opción 20");
    System.out.println("21. Opción 21");
    System.out.println("22. Opción 22");
    System.out.println("23. Opción 23");
    System.out.println("24. Opción 24");
    System.out.println("25. Opción 25");
    System.out.println("26. Opción 26");
    System.out.println("27. Opción 27");
    System.out.println("28. Opción 28");

    System.out.println("29. Salir");
    System.out.print("Seleccione una opción: ");
    opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            EjercicioUno ObjUno = new EjercicioUno();
            ObjUno.pedirDatos();
            ObjUno.calcularFactura();
            break;
        case 2:
            EjercicioDos objdos= new EjercicioDos();
            objdos.tomarDatos();
            break;
        
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
            EjercicioSiete objSiete = new EjercicioSiete();
            objSiete.tomarDatos();
            break;
        case 8:
            EjercicioOcho objOcho = new EjercicioOcho();
            objOcho.pedirDatos();
            break;
        case 9:
            EjercicioNueve objNueve = new EjercicioNueve();
            objNueve.pedirDatos();
            break;
        case 10:
            EjercicioDiez objDiez = new EjercicioDiez();
            objDiez.pedirDatos();
            break;
        case 11:
            EjercicioOnce objOnce = new EjercicioOnce();
            objOnce.pedirDatos();
            break;
        case 12:
            EjercicioDoce objDoce = new EjercicioDoce();
            objDoce.pedirDatos();
            break;
        case 13:
            EjercicioTrece objTrece = new EjercicioTrece();
            objTrece.pedirDatos();
            break;
        case 14:
            EjercicioCatorce objCatorce = new EjercicioCatorce();
            objCatorce.pedirDatos();
            break;
        case 15:
            EjercicioQuince objQuince = new EjercicioQuince();
            objQuince.pedirDatos();
            break;   
        case 16:
            EjercicioDieciseis ejercicio = new EjercicioDieciseis();
             ejercicio.pedirDatos();
            break; 
        case 17:
             EjercicioDiecisiete juego = new EjercicioDiecisiete();
             juego.iniciarJuego();
            break; 
        case 18:
             EjercicioDieciocho libreria = new EjercicioDieciocho();
             libreria.iniciarRegistro();
            break;
        case 19:
             EjercicioDiecinueve menu = new EjercicioDiecinueve();
             menu.iniciarPedido();
            break; 
        case 20:
             EjercicioVeinte temp = new EjercicioVeinte();
             temp.verificarTemperatura();
            break; 
        case 21:
             EjercicioVeintiuno notas = new EjercicioVeintiuno();
             notas.calcularPromedio();
            break; 
        case 22:
             EjercicioVeintidos gestorTareas = new EjercicioVeintidos();
             gestorTareas.gestionarTareas();
            break;
        case 23:
             EjercicioVeintitres registroVentas = new EjercicioVeintitres();
             registroVentas.registrarVentas();
        case 24:
             EjercicioVeinticuatro ejercicioVeinticuatro = new EjercicioVeinticuatro();
             ejercicioVeinticuatro.registrarVehiculos();
            break;
        case 25:
             EjercicioVeinticinco ejercicioVeinticinco = new EjercicioVeinticinco();
             ejercicioVeinticinco.realizarCompra();
             break;
        case 26:
             EjercicioVeintiseis ejercicioVeintiseis = new EjercicioVeintiseis();
             ejercicioVeintiseis.gestionarContactos();
             break;
        case 27:
             EjercicioVeintisiete ejercicioVeintisiete = new EjercicioVeintisiete();
             ejercicioVeintisiete.sumarNumeros();
             break;
        case 28:
             EjercicioVeintiocho ejercicioVeintiocho = new EjercicioVeintiocho();
             ejercicioVeintiocho.registrarVentas();
             break;
            
        default:
            System.out.println("Opción inválida.");
            break;
    }
} while (opcion != 29);

scanner.close();

        
   
       
        
        
    }
    
}
