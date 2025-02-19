/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;



import java.util.Scanner;

public class EjercicioOcho {
    private double altura;
    private double peso;
    private double imc;
    private String categoria;
    private int opcion;

    public EjercicioOcho() {
        
    }

    public void pedirDatos() {
        Scanner p = new Scanner(System.in);
        System.out.println("Calcularemos tu IMC");
        
        
        System.out.println("Dime el peso en kilogramos:");
        peso = p.nextDouble();
        
       

        
        System.out.println("Dime la altura en metros agregando la coma:");
        altura = p.nextDouble();
        
        
        

        // Calcular el IMC
        imc = calcularIMC();

        // Determinar la categoría
        opcion = hacerOperacion(imc);

        // Mostrar resultados
        System.out.println(mostrarResultados(opcion));
    }

    // Método que calcula el índice de masa corporal
    public double calcularIMC() {
        return peso / (Math.pow(altura, 2));
    }

    // Método que determina la categoría del IMC
    private int hacerOperacion(double imc) {
        if (imc < 18.5) {
            categoria = "Bajo peso";
            opcion = 1;
        } else if (imc < 24.9) {
            categoria = "Peso normal";
            opcion = 2;
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
            opcion = 3;
        } else {
            categoria = "Obesidad";
            opcion = 4;
        }
        return opcion;
    }

    // Método que muestra los resultados
    private String mostrarResultados(int opcion) {
        String imcFormateado = String.format("%.2f", imc); // Formatear el IMC a dos decimales

        switch (opcion) {
            case 1:
                return "Su IMC es " + imcFormateado + " y padece de " + categoria;
            case 2:
                return "Su IMC es " + imcFormateado + " y padece de " + categoria;
            case 3:
                return "Su IMC es " + imcFormateado + " y padece de " + categoria;
            default:
                return "Su IMC es " + imcFormateado + " y padece de " + categoria;
        }
    }
    

    
    
    
    
    
    
    
    
    
    
}
