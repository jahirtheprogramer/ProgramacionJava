/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author SENA
 */
public class Asientos {
    private int numero;
    private boolean ocupado;

    public Asientos(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public boolean reservar() {
        if (!ocupado) {
            ocupado = true;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }
}


