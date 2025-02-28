/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Usuario
 */
public class Dividir {
    private double valorUno;
    private double valorDos;

 public Dividir(double Nvaloru,double Nvalord){
   this.valorUno=Nvaloru;
  this.valorDos=Nvalord;
}

public double getvaloru(){
        return valorUno;
    }
    
    public void setvaloru(double Nvaloru){
        this.valorUno=Nvaloru;
    }
    
      public double getvalord(){
        return valorDos;
    }
    
    public void setvalod(double Nvalord){
        this.valorDos=Nvalord;
    }
    
    public void dividir(){
        System.out.println("la suma de los valores es " + (valorUno/valorDos));
    }









}
