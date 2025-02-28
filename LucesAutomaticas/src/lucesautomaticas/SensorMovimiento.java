/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucesautomaticas;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class SensorMovimiento {
    private boolean movimientoDetectado;

    public void actualizarEstado() {
        Random random = new Random();
        this.movimientoDetectado = random.nextBoolean(); // Simula detección aleatoria
    }

    public boolean hayMovimiento() {
        return movimientoDetectado;
    }
}