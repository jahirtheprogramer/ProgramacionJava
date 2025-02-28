/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intrusos;

/**
 *
 * @author Usuario
 */
class SistemadeSeguridad {
    private Sensor sensor1;
    private Sensor sensor2;
    private Sensor sensor3;
    private boolean esDeNoche;
    private boolean alarmaActivada;

    public SistemadeSeguridad() {
        this.sensor1 = new Sensor();
        this.sensor2 = new Sensor();
        this.sensor3 = new Sensor();
        this.esDeNoche = false;
        this.alarmaActivada = false;
    }

    public void activarAlarma() {
        alarmaActivada = true;
        System.out.println("Alarma activada.");
    }

    public void desactivarAlarma() {
        alarmaActivada = false;
        System.out.println("Alarma desactivada.");
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void verificarSensores() {
        sensor1.detectarMovimiento();
        sensor2.detectarMovimiento();
        sensor3.detectarMovimiento();

        int sensoresActivos = 0;
        if (sensor1.isDetectaMovimiento()) sensoresActivos++;//evaluamos si el sensor ha detectado movimiento, si el sensor lanza true, pues sumamos uno a la variable sensores activos
        if (sensor2.isDetectaMovimiento()) sensoresActivos++;
        if (sensor3.isDetectaMovimiento()) sensoresActivos++;

        System.out.println("Sensor 1: " + sensor1.isDetectaMovimiento());
        System.out.println("Sensor 2: " + sensor2.isDetectaMovimiento());
        System.out.println("Sensor 3: " + sensor3.isDetectaMovimiento());
        System.out.println("Es de noche: " + esDeNoche);

        if (alarmaActivada && esDeNoche && sensoresActivos >= 2) {
            System.out.println("¡ALERTA! Intruso detectado. La alarma se ha activado.");
        } else {
            System.out.println("Todo en orden.");
        }
    }
}
