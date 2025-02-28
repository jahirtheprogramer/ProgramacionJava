/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int operacion;
        double resultado;
        do{
         System.out.println("dime que numeros realizaran la operacion");
         System.out.println("numero 1");
         double  uno=obj.nextDouble();
         System.out.println("numero 2");
         double dos=obj.nextDouble();
         System.out.println("dime el numero de la operacion a realizar:");
            System.out.println("1.suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. salir del programa");
         operacion= obj.nextInt();
        
         switch (operacion){
             case 1:
             Suma sum = new Suma(uno,dos);
             sum.sumar();
            break;
             case 2:
             Resta rest = new Resta(uno,dos);
             rest.restar();
            break;
            case 3:
             Multiplicar mult =new Multiplicar(uno,dos);
            mult.multiplicar();
            break;
            case 4:
            Dividir div = new Dividir(uno,dos);
            div.dividir();
            break;
            case 5:
                System.out.println("saliendo del sistema");
            return;
            default:
                System.out.println("elige una opcion de acuerdo al sistema");
            break;
         }
        
        
        
        
        }while(operacion!=5);
       
        
            
        
    }
    
}
