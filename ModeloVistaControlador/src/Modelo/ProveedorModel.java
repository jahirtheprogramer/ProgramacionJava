/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class ProveedorModel {
    //atributos de la clase
     private  String[] listaProveedor ;
     private String[] listaId;
     private String[] tipoProveedorlista;
     private String proveedorTipo;
     private String id;
     private String NombreP;
     private int contador;
     // metodo constructor de la clase 
     public ProveedorModel (){
         this.id=" ";
         this.listaProveedor= new String [3];
         this.NombreP=" ";
         this.listaId= new String [3];
         this.contador= 0;
         this.tipoProveedorlista= new String[3];
         this.proveedorTipo=" ";
     }
     // metodos normales de los atributos
     public String getNombreP(){
         return NombreP;
     }
     
     public void setNombreP (String NombreP){
         this.NombreP=NombreP;
     }
     
    public String getid(){
         return id;
     }
     
     public void setid (String id){
         this.id=id; 
     }
     public String gettipoProveedor(){
      return proveedorTipo; 
    }
    public void setTipoproveedor(String proTipo){
     this.proveedorTipo=proTipo;
    }
     public String[] getListaTipoProveedor(){
       return tipoProveedorlista;
    } 
      public String[] getListaproveedor(){
        return listaProveedor;
    }
     public String[] getListaid(){
        return listaId;
    }
     
     // metodos normales de la clase
     
     public void GuardarDatos(String datoNombrep, String datoidp, String datotipoproveedor){
 if (this.contador < this.listaProveedor.length) {
    
    for (int i = 0; i < this.contador; i++) { 
                  if (listaProveedor[i].equals(datoNombrep) || listaId[i].equals(datoidp)) {
            System.out.println(" Proveedor con nombre o ID repetido  " + datoNombrep + " - " + datoidp + " - " + datotipoproveedor);
            return;
        }
           
    }
   

// agrgar datos
    this.listaProveedor[this.contador] = datoNombrep;
    this.listaId[this.contador] = datoidp;
    this.tipoProveedorlista[this.contador]=datotipoproveedor;
    this.contador++;
    System.out.println(" Información guardada.");
} else {
    System.out.println(" No se pueden agregar más proveedores, la lista está llena.");
}
     }   
     
     
     
     
    public void imprimirProveedor(){
 for(int i =0; i<this.listaProveedor.length; i++ ){
     System.out.println("XXX: " + this.listaProveedor[i]);
     System.out.println("XXX: " + this.listaId[i]);
     System.out.println("XXX: " + this.tipoProveedorlista[i]);
} 
   }    


    public void buscarProveedor(String idBuscarp){
        
        Set<String> setIds = new HashSet<>(Arrays.asList(listaId));//se creo esta estructura de datos para posteriormente usar
         for (int i = 0; i < this.contador; i++) { 
              if (setIds.contains(idBuscarp)) { //este metodo para saber si el metodo posee un valor especifico.
            System.out.println("Proveedor encontrado:");
            System.out.println("Nombre: " + this.listaProveedor[i]);
            System.out.println("ID: " + this.listaId[i]);
            System.out.println("Tipo: " + this.tipoProveedorlista[i]);
            return;
        }else{
                System.out.println("proveedor no encontrado");
                break;
              }
                 
         }
    } 
    
    
    
}