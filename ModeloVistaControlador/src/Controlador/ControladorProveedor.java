/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ProveedorModel;
import Vista.ProveedorView;

public class ControladorProveedor {
    private ProveedorModel objmodelo_proveedor;
    private ProveedorView objvista_proveedor;
    
  public ControladorProveedor(ProveedorModel objproveedor, ProveedorView objproveedorVista){
    this.objmodelo_proveedor= objproveedor;
    this.objvista_proveedor=objproveedorVista;
}  
  //medoto que inicia la ejecucion del formulario
public void EmpezarFormulario(){
    int opcion=0;
    do{
        opcion=this.objvista_proveedor.mostrarMenuProveedor();
        switch(opcion){
            case 1:
                String auxNombre = this.objvista_proveedor.tomarRegistronombre_proveedor();
                String auxid = this.objvista_proveedor.tomarRegistroid_proveedor();
                String auxtipo= this.objvista_proveedor.tomar_tipo_proveedor();
                this.objmodelo_proveedor.GuardarDatos(auxNombre, auxid, auxtipo);
            break;
            case 2:
               this.objmodelo_proveedor.imprimirProveedor();
            break;
            case 3:
                String idBuscar= this.objvista_proveedor.buscarid();
                this.objmodelo_proveedor.buscarProveedor(idBuscar);
            break;
            case 4:
                System.out.println("saliendo del sistema....");
            break;
            default:
                System.out.println("Opicionno valida");
        }
    }while(opcion!=4);
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
