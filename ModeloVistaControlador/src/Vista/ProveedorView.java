/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProveedorView {
    private String colorBoton;
  private int numBoton;
  private int numLabel;
  private String colorLabel;
  private String colorFormulario;
     private Scanner teclado;   
     
     public ProveedorView(){
        this.colorBoton="rojo";
        this.colorFormulario="blanco";
        this.colorLabel= "amarrillo";
        this.numBoton=5;
        this.numLabel=10;
     }
     
    // muestra menu 
    public int mostrarMenuProveedor(){
    System.out.println("Bienvenido al sistema proveedor");
    System.out.println("1. Registrar proveedor");
    System.out.println("2. ver lista de proveedores");
    System.out.println("3. Buscar proveedor por id");
    System.out.println("4. salir");
    this.teclado= new Scanner(System.in);
    System.out.println("seleccione una opcion.....");
   int OpcionMenu = teclado.nextInt();
   return OpcionMenu;
}
    
    //pide datos del nombre y de la identificacion
    public String tomarRegistronombre_proveedor(){
    this.teclado= new Scanner(System.in);
    System.out.println("Bienvenido al sistema");
    System.out.println("Digite el nombre del proveedor");
    String nombreproveedor = teclado.nextLine();
    
   return nombreproveedor;
}
    
    public String tomarRegistroid_proveedor(){
        this.teclado= new Scanner(System.in);
        System.out.println("digite la identificacion del proveedor");
        String idproveedor= teclado.nextLine();
        return idproveedor;
    }
   
   public String tomar_tipo_proveedor(){
        this.teclado= new Scanner(System.in);
        System.out.println("dime que tipo de proveedor es");
        String tipoP= teclado.nextLine();
        return tipoP;
    }
    
    public String buscarid (){
        this.teclado= new Scanner(System.in);
        System.out.println("dime el id a buscar");
        String idprovedor=teclado.nextLine();
        return idprovedor;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
