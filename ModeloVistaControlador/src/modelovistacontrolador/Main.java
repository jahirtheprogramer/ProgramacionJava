
package modelovistacontrolador;

import Controlador.Controlador;
import Controlador.ControladorProveedor;
import Vista.RegistroCliente;
import Vista.ProveedorView;
import Modelo.Cliente;
import Modelo.ProveedorModel;


public class Main {

   
    public static void main(String[] args) {



       

       Cliente objCliente = new Cliente();
       RegistroCliente objFormulario = new RegistroCliente();
       Controlador objControlador = new Controlador (objCliente, objFormulario);
       objControlador.iniciarFormulario();
       
       
       // llamada de los proveedores
       ProveedorModel objproveedor = new ProveedorModel();
       ProveedorView objproveedorVista = new ProveedorView();
       ControladorProveedor objControladorp = new ControladorProveedor(objproveedor,objproveedorVista);
       objControladorp.EmpezarFormulario();
 
     
    }
    
}
