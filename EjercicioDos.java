
package ejercicios;

// creacion de la clase 

import java.util.Scanner;

public class EjercicioDos {
 
    // creacion del constructor
    
 public EjercicioDos(){
     
 }   
   // metodo de toma de datos para saber el ascensor al que subira el ususario
public void tomarDatos(){
    Scanner obj = new Scanner(System.in);
    System.out.println("ingresa el piso al que deseas ir");
    System.out.println("1,2,3,4,5");
    int piso = obj.nextInt();
    
    String resultado= calcularPiso(piso);
    System.out.println(" usuario, " + resultado);
    
} 
    
// creacion del metodo que calcula si el piso es correcto o incorrecto

private static String calcularPiso (int piso){
      int[] numeros = {1, 2, 3, 4, 5};
    if (piso >=0 && piso < numeros.length){
        return"el piso seleccionado es correcto";
    }else{
        return "el piso no se encuentra disponible ";
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
