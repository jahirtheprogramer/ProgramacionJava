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
public class SensorTemperatura {
    private double temperatura;

    public void actualizarTemperatura() {
        Random random = new Random();
        this.temperatura = 25 + random.nextDouble() * 10; // Simula entre 25°C y 35°C
    }

    public double getTemperatura() {
        return temperatura;
    }
}
