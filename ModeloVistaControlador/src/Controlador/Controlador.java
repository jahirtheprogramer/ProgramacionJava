
package Controlador;


 import Modelo.Cliente;
 import Vista.RegistroCliente;

public class Controlador {
    private RegistroCliente objFormulario_registro;
    private Cliente objmodelo_Cliente;


public Controlador (Cliente objCliente, RegistroCliente objFormulario){
 this.objmodelo_Cliente= objCliente;
 this.objFormulario_registro= objFormulario;

}

//metodo que inicia la ejecucion del formulario
public void iniciarFormulario(){
int opcion=0;
do{
 opcion=this.objFormulario_registro.mostrarMenu();
  switch(opcion){
   case 1:
     String auxNombre = this.objFormulario_registro.tomarRegistro_cliente();
     this.objmodelo_Cliente.GuardarClinete(auxNombre);
    break;
   case 2:
     this.objmodelo_Cliente.imprimirCliente();
   break;
   case 3:
       System.out.println("saliendo del sistema....");
   break;
  default:
         System.out.println("Opcion no valida");
 }
}while(opcion !=3);


}

}







