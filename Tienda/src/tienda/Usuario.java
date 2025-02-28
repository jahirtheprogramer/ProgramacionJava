/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Usuario
 */
import java.util.Random;


public class Usuario {
    private boolean tieneMembresia;
    private boolean esEmpleado;

    public Usuario(boolean tieneMembresia, boolean esEmpleado) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }
}
