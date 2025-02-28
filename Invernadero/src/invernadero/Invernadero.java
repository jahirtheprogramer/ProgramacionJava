/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invernadero;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Invernadero {

    
    public static void main(String[] args) {
       Scanner m =new Scanner(System.in);
       System.out.println("dime la temperatura");
      int temperatura=m.nextInt();
       Sensor sensor = new Sensor(temperatura);
       for(int i=1 ; i<=5;i++){
        sensor.ActivarValores();
    try{
       Thread.sleep(5000);
       }catch(InterruptedException e){
}
   
}
    }
    
}
