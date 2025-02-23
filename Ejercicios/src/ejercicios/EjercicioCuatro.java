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
public class EjercicioCuatro {
    public static int limitePeso=90;
    // crear constructor 
   public EjercicioCuatro() {
}

   // metodo de toma de datos para saber el ascensor al que subira el ususario
public void tomarDatos(){
    Scanner obj = new Scanner(System.in);
    System.out.println("ingresa el piso al que deseas ir");
    System.out.println("1,2,3,4,5");
    int piso = obj.nextInt();
    System.out.println("ahora dime tu peso");
    System.out.println("peso limite " + limitePeso);
    int peso = obj.nextInt();
    // llamada al metodo calcularPiso
    String resultado= calcularPiso(piso , peso);
    System.out.println(" usuario, " + resultado);
    
} 
    
// creacion del metodo que calcula si el piso es correcto o incorrecto

private static String calcularPiso (int piso , int peso){
      int[] numeros = {1, 2, 3, 4, 5};
      
    if (piso >=0 && piso < numeros.length && peso<=limitePeso){
        return"el piso seleccionado y el peso  es correcto";
    }else{
        return "el piso no se encuentra disponible";
    }
}


}

