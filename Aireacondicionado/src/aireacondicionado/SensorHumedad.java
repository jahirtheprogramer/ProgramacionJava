/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class SensorHumedad {
    private double humedad;

    public void actualizarHumedad() {
        Random random = new Random();
        this.humedad = 40 + random.nextDouble() * 40; // Simula entre 40% y 80%
    }

    public double getHumedad() {
        return humedad;
    }
}
