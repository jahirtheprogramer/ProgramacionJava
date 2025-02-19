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
public class EjercicioCinco {
    public static int umbral = 40;
    // crear constructor 
   public EjercicioCinco() {
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
  if(temperatura  <=umbral){
      return "estas a temperatura ambiente";

 }else{
      return"Cuidado, estas fuera de la temperatura ambiente";
 }
}
}
