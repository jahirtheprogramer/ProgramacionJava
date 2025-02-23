/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioTrece {
    Scanner scanner = new Scanner(System.in);
    private int cantidad;
    private double costo;
    private double costofinal;
    private double costoparcial;
    private String respuesta="si";
    public EjercicioTrece(){
        
    }
    
    public void pedirDatos(){
        System.out.println("bienvenido");
        Haceroperacion();
    }
    public void Haceroperacion (){
        
                 
        while(respuesta.equalsIgnoreCase("si")){
            System.out.println("====tienda virtual====");
            
            System.out.println("dime la cantidad del producto ");
                cantidad=scanner.nextInt();
            System.out.println("dime el coste por unidad");
                costo=scanner.nextInt();
                 costoparcial=cantidad*costo;
                 costofinal+=costoparcial;
                 System.out.println("el coste de momento es "+ costoparcial);
                 scanner.nextLine();
            System.out.println("desea agregar otro producto?(si/no)");
            respuesta=scanner.nextLine();
            if(respuesta=="si"){
                 System.out.println("dime la cantidad del producto ");
                cantidad=scanner.nextInt();
            System.out.println("dime el coste por unidad");
                costo=scanner.nextInt();
            costofinal=cantidad*costo;
            }else{
                System.out.println("el coste final de la compra es de " + costofinal);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
}
