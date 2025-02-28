/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucesautomaticas;

/**
 *
 * @author Usuario
 */
class SistemaDomotico {
    private SensorMovimiento sensor;
    private Luces luces;
    private boolean noche;

    public SistemaDomotico() {
        this.sensor = new SensorMovimiento();
        this.luces = new Luces();
        this.noche = false; // Inicialmente es de día
    }

    public void establecerHora(boolean esNoche) {
        this.noche = esNoche;
    }

    public void gestionarLuces() {
        sensor.actualizarEstado();
        System.out.println("Es de noche: " + noche);
        System.out.println("Movimiento detectado: " + sensor.hayMovimiento());

        if (noche && sensor.hayMovimiento()) {
            luces.encender();
        } else {
            luces.apagar();
        }
    }
}
