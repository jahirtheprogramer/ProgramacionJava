/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Usuario
 */import java.util.Scanner;

public class EjercicioDieciseis {
    Scanner scanner = new Scanner(System.in);
    private int numero;

    public EjercicioDieciseis() {
    }

    public void pedirDatos() {
        System.out.println("Hola, soy un simulador de cuenta regresiva.");
        iniciarCuentaRegresiva();
    }

    public void iniciarCuentaRegresiva() {
        System.out.print("Por favor ingresa un número entero positivo para comenzar la cuenta regresiva: ");
        numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Error: El número debe ser un entero positivo.");
            return;
        }

        System.out.println("Comenzando cuenta regresiva...");
        
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hubo un error al pausar la cuenta regresiva.");
            }
        }

        System.out.println("¡Tiempo cumplido!");
    }
}

