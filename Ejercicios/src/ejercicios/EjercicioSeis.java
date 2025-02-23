
package ejercicios;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioSeis {
   public static int tempMIN=10;
   public static int tempMAX=40;
    
   public EjercicioSeis () {
    
}
   // metodos
   public void tomarDatos(){
    Scanner obj = new Scanner(System.in);
    System.out.println("dime la temperatura actual");
    int temperatura = obj.nextInt();
   
    // llamada al metodo calcularPiso
    String resultado= calcularTemperatura(temperatura );
    System.out.println(" usuario, " + resultado);
    
} 
   private static String calcularTemperatura (int temperatura ){
      int[] numeros = {1, 2, 3, 4, 5};
      Scanner p = new Scanner(System.in);
    if (temperatura >=tempMIN && temperatura <= tempMAX ){
        System.out.println("la temperatura es adecuada");
        System.out.println("introduce el piso");
        int piso = p.nextInt();
        if(piso >=0 && piso < numeros.length){
            return"el piso seleccionado  es correcto";
     }else {
        return "el piso no se encuentra disponible";
    }
        }else{
        return "la temperatura no es la adecuada";
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
