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
public class EjercicioCatorce {
    Scanner scanner = new Scanner(System.in);
    private int capacidad=100;
    private int cantidad;
    private int eleccion;
    private int finalizar;
    public  EjercicioCatorce(){
        
    }
    
    public void pedirDatos(){
        System.out.println("hola, soy una impresora");
        System.out.println("cuantas paginas imprimiremos");
        
        Imprimir();
    }
    
    
    public void Imprimir (){
        while(finalizar !=3){
            System.out.println("1.imprimir , 2.revisar capacidad, 3.finalizar");
            eleccion=scanner.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("imprimir cantidad de : ");
                    cantidad=scanner.nextInt();
                    if(cantidad>capacidad){
                        System.out.println("Error, la cantidad supera la capacidad");
                    }else if(cantidad <=0){
                        System.out.println("Eror, la cantidad tiene que ser mayor a 0");
                        
                    }else{
                        System.out.println("imprimiendo.....");
                        System.out.println("se imprimieron " + cantidad + "  hojas");
                        capacidad-=cantidad;
                        
                    }
                    break;
                case 2:
                    System.out.println("la cantidad actual es " + capacidad);
                    break;
                case 3:
                    System.out.println("saliendo del programa....");
                    finalizar=3;
                    break;
                default :
                    System.out.println("digita una opcion valida");
                    break;
            }   
                 
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
