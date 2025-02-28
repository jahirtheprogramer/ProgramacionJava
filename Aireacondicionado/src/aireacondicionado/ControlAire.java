/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado;

/**
 *
 * @author Usuario
 */
public class ControlAire {
    private SensorTemperatura sensorTemperatura;
    private SensorHumedad sensorHumedad;
    private AireAcondicionado aireAcondicionado;

    public ControlAire() {
        this.sensorTemperatura = new SensorTemperatura();
        this.sensorHumedad = new SensorHumedad();
        this.aireAcondicionado = new AireAcondicionado();
    }

    public void gestionarAireAcondicionado() {
        sensorTemperatura.actualizarTemperatura();
        sensorHumedad.actualizarHumedad();

        double temperatura = sensorTemperatura.getTemperatura();
        double humedad = sensorHumedad.getHumedad();

        System.out.println("\n️ Temperatura: " + temperatura + "°C");
        System.out.println(" Humedad: " + humedad + "%");

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            aireAcondicionado.encender();
        } else {
            aireAcondicionado.apagar();
        }
    }
}
