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
public class EjercicioNueve {
    private int edad;
    private int opcion;
    private String tipoPeli;
    
    
    
    
    public EjercicioNueve (){
        

    }
    
   public void pedirDatos (){
  Scanner p = new Scanner(System.in);
       System.out.println("Asistencia virtual de cine");
       System.out.println("dime tu edad");
       edad = p.nextInt();
  opcion = CalcularPelicula(edad);
  System.out.println(mostrarResultados(opcion));


}
    
   private int CalcularPelicula(int edad) {
        if (edad < 17) {
            tipoPeli = "Te recomiendo pocoyo";
            opcion = 1;
        } else if (edad > 7 && edad <= 17) {
            tipoPeli = "Te recomiendo avengers ";
            opcion = 2;
        } else if (edad >= 18 && edad <= 30) {
            tipoPeli = "te recomiendo la muñeca anabel";
            opcion = 3;
        } else {
            tipoPeli = "te recomiendo crepusculo";
            opcion = 4;
        }
        return opcion;
    }
    
 private String mostrarResultados(int opcion) {
       
        switch (opcion) {
            case 1:
                return "segun el analisis,  " + tipoPeli;
            case 2:
                return "segun el analisis,  " + tipoPeli;
            case 3:
                return "segun el analisis,  " + tipoPeli;
            default:
                return "segun el analisis,  " + tipoPeli;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
