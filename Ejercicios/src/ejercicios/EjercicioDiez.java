/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjercicioDiez {
 Scanner scanner= new Scanner(System.in);
  private int n;
  private int partidos;
  private String[] equipos;
  private  int[] puntos ;
  private String entrada;
  private int idx1;
  private int idx2;
  private String resultado;
public EjercicioDiez(){
}

public void pedirDatos (){
    System.out.println("Tabla de la liga Santander");
    // solicitar cantidad de equipos 
    System.out.println("dime la cantidad de equipos que quieres registrar");
     n = scanner.nextInt();
    scanner.nextLine();
    equipos = new String[n];
    puntos = new int[n];
    // llenar el array con los nombres de los equipos
      for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
            equipos[i] = scanner.nextLine();
        }
      // solicitar la cantidad de partidos
       System.out.print("Ingrese el número de partidos a registrar: ");
         partidos = scanner.nextInt();
        scanner.nextLine();
        
        // ciclo pa pedir los resultados
           for (int i = 0; i < partidos; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            System.out.print("Ingrese el resultado ( Equipo1 Equipo2 Resultado [G/E/P]): ");
             entrada = scanner.nextLine();

            String[] datos = entrada.split(" ");
            if (datos.length != 3) {
                System.out.println(" Use: Equipo1 Equipo2 Resultado (G/E/P)");
                i--; // Decrementa para volver a ingresar el resultado
                continue;
            }
            String equipo1 = datos[0];
            String equipo2 = datos[1];
            String resultado = datos[2].toUpperCase();

            // Buscar índice de los equipos en el array
             idx1 = buscarIndice(equipos, equipo1);
             idx2 = buscarIndice(equipos, equipo2);

            if (idx1 == -1 || idx2 == -1) {
                System.out.println("Uno o ambos equipos no existen.");
                i--; // Decrementa para volver a ingresar el resultado
                continue;
            }
            switch (resultado) {
                case "G":
                    puntos[idx1] += 3;
                    break;
                case "E":
                    puntos[idx1] += 1;
                    puntos[idx2] += 1;
                    break;
                case "P":
                    puntos[idx2] += 3;
                    break;
                default:
                    System.out.println("Resultado inválido. Use G/E/P.");
        {
            
            i--; // Decrementa para volver a ingresar el resultado
        }
                    continue;

            }
}
                   
                     ordenarClasificacion(equipos, puntos);

        System.out.println(" Tabla de Clasificación:");
        for (int i = 0; i < equipos.length; i++) {
            System.out.println((i + 1) + ". " + equipos[i] + " - " + puntos[i] + " pts");
        }
        }

   public static int buscarIndice(String[] equipos, String equipo) {
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i].equalsIgnoreCase(equipo)) {
                return i;
            }
        }
        return -1; 
    }

    //  Ordenar equipos por puntos (Bubble Sort)
    public static void ordenarClasificacion(String[] equipos, int[] puntos) {
        int n = equipos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (puntos[j] < puntos[j + 1]) {
                    
                    int tempPuntos = puntos[j];
                    puntos[j] = puntos[j + 1];
                    puntos[j + 1] = tempPuntos;

                    String tempEquipo = equipos[j];
                    equipos[j] = equipos[j + 1];
                    equipos[j + 1] = tempEquipo;
                }
            }
        }      
      

     

}


























}
