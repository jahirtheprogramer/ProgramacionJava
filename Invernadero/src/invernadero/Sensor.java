/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invernadero;

/**
 *
 * @author SENA
 */
public class Sensor {
    private int temperatura;
    private int tempmin=10;
    private int tempmax=25;
   
  public Sensor(int Temperatura){
  this.temperatura=Temperatura;
}

public int getTemperatura(){
 return temperatura;
}

public void setTemperatura(int Temperatura){
 this.temperatura=Temperatura;
}

    public void ActivarValores(){
    if(temperatura<10){
      Calefactor calefactor= new Calefactor();
        System.out.println("Activando......");
        calefactor.activarCalefactor();
   }else if(tempmin>=10 && tempmax<=25){
         System.out.println("Activando......");
        System.out.println("inactividad");
    }else{
        System.out.println("Activando......");
        Ventilador ventilador= new Ventilador();
        ventilador.activarVentilador();
    }

}
}
