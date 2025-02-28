/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aireacondicionado;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        ControlAire controlAire = new ControlAire();
        int ciclos = 3;

        for (int i = 0; i < ciclos; i++) {
            System.out.println("\n Ciclo " + (i + 1));
            controlAire.gestionarAireAcondicionado();

            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
