package ejercicios;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

public class EjercicioSiete {
    public static double precioA = 1000;
    public static double precioV = 2000;
    public static double precioE = 3000;
    public static double descuento1 = 10.0; // 10%
    public static double descuento2 = 5.0;  // 5% 

    public EjercicioSiete() {
    }

    public void tomarDatos() {
        Scanner p = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("¿Qué desea comprar?");
        System.out.println("A. Alimentos, V. Vestimenta, E. Electrónicos");
        System.out.println("Escriba la inicial de acuerdo al interés:");
        
        char caracter = p.next().toUpperCase().charAt(0); // Convierte a mayúscula para evitar errores

        System.out.println("Dime la cantidad de productos de " + caracter + ":");
        
        while (!p.hasNextInt()) { 
            System.out.println("Error: Debes ingresar un número entero.");
            p.next(); // Limpia la entrada incorrecta
        }
        int cantidad = p.nextInt();

        while (cantidad <= 0) { 
            System.out.println("Error: Ingresa un número positivo.");
            cantidad = p.nextInt();
        }

        String resultado = calcularCoste(caracter, cantidad);//llamada al metodo
        System.out.println(resultado);

      
    }

    private static String calcularCoste(char caracter, int cantidad) {
        double precioFinal, costeTotal;
        
        switch (caracter) {
            case 'A':
                costeTotal = precioA * cantidad;
                System.out.println("Tienes un descuento del 10%");
                precioFinal = costeTotal - (costeTotal * (descuento1 / 100));
                return "El producto " + caracter + " tiene un coste de $" + costeTotal + " y un coste final con descuento de $" + precioFinal;

            case 'V':
                costeTotal = precioV * cantidad;
                System.out.println("Tienes un descuento del 5%");
                precioFinal = costeTotal - (costeTotal * (descuento2 / 100));
                return "El producto " + caracter + " tiene un coste de $" + costeTotal + " y un coste final con descuento de $" + precioFinal;

            case 'E':
                precioFinal = precioE * cantidad;
                System.out.println("No tienes un descuento.");
                return "El producto " + caracter + " tiene un coste de $" + precioFinal;

            default:
                return "Error: Opción no válida.";
        }
    }
}
