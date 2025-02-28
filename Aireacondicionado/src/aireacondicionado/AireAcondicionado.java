/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado;

/**
 *
 * @author Usuario
 */
public class AireAcondicionado {
    private boolean encendido;

    public void encender() {
        encendido = true;
        System.out.println("️ Aire acondicionado ENCENDIDO.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("️ Aire acondicionado APAGADO.");
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
