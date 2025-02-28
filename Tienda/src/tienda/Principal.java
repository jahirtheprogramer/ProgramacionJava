/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Usuario cliente1 = new Usuario(true, false); // Cliente con membresía
        Usuario cliente2 = new Usuario(false, false); // Cliente sin membresía ni empleo
        Usuario empleado = new Usuario(false, true); // Empleado

        ControlAcceso control = new ControlAcceso();
        int ciclos = 5; // Simula 5 intentos de acceso

        for (int i = 0; i < ciclos; i++) {
            System.out.println("\n Intento " + (i + 1));
            control.verificarAcceso(cliente1); 
            control.verificarAcceso(cliente2); 
            control.verificarAcceso(empleado);

            try {
                Thread.sleep(3000); // Espera 3 segundos entre intentos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
