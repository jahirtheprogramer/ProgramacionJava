
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjercicioOnce {
    

private double total;
private int opcion;
private int metodoPago;
public EjercicioOnce(){
         
}
    public static void mostrarMenu() {
        System.out.println("====================================");
        System.out.println("         MENÚ DEL RESTAURANTE       ");
        System.out.println("====================================");
        System.out.println("1. Hamburguesa Clásica  -  15,000 COP");
        System.out.println("2. Pizza Pepperoni      -  25,000 COP");
        System.out.println("3. Bandeja Paisa        -  30,000 COP");
        System.out.println("4. Ensalada César       -  18,000 COP");
        System.out.println("5. Jugo Natural         -   7,000 COP");
        System.out.println("6. Café                 -   5,000 COP");
        System.out.println("7. Finalizar pedido");
        System.out.println("====================================");
    }
public double pedirDatos(){
      mostrarMenu();
      do {
          Scanner pedido = new Scanner(System.in);
            System.out.print("Seleccione un producto (1-7): ");
            opcion = pedido.nextInt();

            switch (opcion) {
                case 1:
                    total += 15000;
                    System.out.println(" Agregaste una Hamburguesa Clásica.");
                    break;
                case 2:
                    total += 25000;
                    System.out.println(" Agregaste una Pizza Pepperoni.");
                    break;
                case 3:
                    total += 30000;
                    System.out.println(" Agregaste una Bandeja Paisa.");
                    break;
                case 4:
                    total += 18000;
                    System.out.println(" Agregaste una Ensalada César.");
                    break;
                case 5:
                    total += 7000;
                    System.out.println("Agregaste un Jugo Natural.");
                    break;
                case 6:
                    total += 5000;
                    System.out.println(" Agregaste un Café.");
                    break;
                case 7:
                    System.out.println("Finalizando pedido...");
                    break;
                default:
                    System.out.println(" Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 7);
      SolicitarMetodoPago(total);
      return total;
      
}

public void SolicitarMetodoPago(double total){
    Scanner pedido = new Scanner(System.in);
     System.out.println("ahora dime el metodo de pago");
     System.out.println(" 1.Efectivo , 2.Tarjeta de credito, 3.Cheque");
     metodoPago=pedido.nextInt();
     
      switch (metodoPago) {
            case 1:
                total *= 0.90; 
                System.out.println(" Pago en efectivo. Se aplica un 10% de descuento.");
                break;
            case 2:
                total *= 0.95; 
                System.out.println("Pago con tarjeta de crédito. Se aplica un 5% de descuento.");
                break;
            case 3:
                System.out.println("Pago con cheque. No se aplica descuento.");
                break;
            default:
                System.out.println(" Método de pago no válido. No se aplica descuento.");
        }

      System.out.println("Total a pagar: % "+ total);
        System.out.println("¡Gracias por su compra!️");

        
     
}
}
