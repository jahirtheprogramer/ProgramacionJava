/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucesautomaticas;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Principal {
       public static void main(String[] args) {
        SistemaDomotico sistema = new SistemaDomotico();
        int ciclos = 5; // Simula 5 ciclos de verificación

        for (int i = 0; i < ciclos; i++) {
            System.out.println("\n Ciclo " + (i + 1));
            sistema.establecerHora(new Random().nextBoolean()); // Simula cambio de día/noche
            sistema.gestionarLuces();

            try {
                Thread.sleep(10000); // Espera 10 segundos entre ciclos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
