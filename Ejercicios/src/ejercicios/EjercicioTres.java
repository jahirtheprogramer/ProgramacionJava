
package ejercicios;

// 1 crear la calse 

import java.util.Scanner;

public class EjercicioTres {
    
  
// crear constructor 
   public EjercicioTres() {
}
 // creacion de metodos para el ejercicio 1
 public void tomarDatos(){
     Scanner obj = new Scanner(System.in);
    System.out.println("hola, por favor ingresa la temperatura actual");
     System.out.println("calcularemos el nivel de temperatura");
     double temperatura = obj.nextDouble();

  String resultado= calcularDato(temperatura);
     System.out.println("estado de temperatura es: " + resultado);
}

private static String calcularDato (double temperatura){
  if(temperatura >=18 && temperatura <=25){
      return "estas a temperatura ambiente";

 }else{
      return"Cuidado, estas fuera de la temperatura ambiente";
 }
}

   }



