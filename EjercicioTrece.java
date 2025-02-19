
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioTrece {
    
    public static double saldo = 10000;
    
    
    
    public EjercicioTrece(){
        
    }
    
    public void pedirDatos(){
        Scanner p = new Scanner (System.in);
        System.out.println("bienvenido, digite el saldo a retirar");
        double monto = p.nextDouble();
        
        
    }
    
       public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor que cero.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo + " COP");
        }
    }

    
    
    
    
    
    
}
