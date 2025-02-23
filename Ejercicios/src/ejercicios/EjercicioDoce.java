
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioDoce {
     Scanner scanner = new Scanner(System.in);
    public static double saldo = 100000;
    private int finalizar;
    private int opcion;
    private double monto;
    public EjercicioDoce(){
        
    }
    
    public void pedirDatos(){
      
       
        System.out.println("sistema de retiros bancojahir");
        retirar();
        
    }
    
       public void retirar() {
           while (finalizar !=3){
        
         System.out.println("seleccione la opcion de acuerdo al criterio");
         System.out.println("1.retirar, 2.consultar saldo, 3.salir");
           opcion=scanner.nextInt(); 
            switch(opcion){
                case 1:
               System.out.println("bienvenido, digite el saldo a retirar");
               monto = scanner.nextDouble();
            if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso.");
        }
            break;
                case 2:
                  System.out.println("Saldo restante: " + saldo + " COP");
                  break;
            case 3:
                System.out.println("saliendo del programa...."); 
                 finalizar = 3;
             break;
            default:
                System.out.println("seleccione una de las opciones designadas por favor");
                break;
           }
      
    }

       } 
    
    
    
    
    
}
