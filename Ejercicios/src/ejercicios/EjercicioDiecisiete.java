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
public class EjercicioDiecisiete {
     Scanner scanner = new Scanner(System.in);
    private int numeroSecreto;
    private int intento;

    public EjercicioDiecisiete() {
    }

    public void iniciarJuego() {
        generarNumeroSecreto();
        adivinarNumero();
    }

    private void generarNumeroSecreto() {
        numeroSecreto = (int) (Math.random() * 100) + 1; // Genera un número aleatorio entre 1 y 100
    }

    private void adivinarNumero() {
        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinar cuál es?");
        
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("¡El número es mayor! Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("¡El número es menor! Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (intento != numeroSecreto);
    }
}
