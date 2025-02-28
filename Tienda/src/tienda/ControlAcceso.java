/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ControlAcceso {
    private boolean horarioAtencion;

    public void actualizarHorario() {
        Random random = new Random();
        this.horarioAtencion = random.nextBoolean(); // Simula si la tienda está abierta o cerrada
    }

    public boolean estaDentroHorario() {
        return horarioAtencion;
    }

    public void verificarAcceso(Usuario usuario) {
        actualizarHorario();
        System.out.println("\n Horario de atención: " + (horarioAtencion ? "Abierto" : "Cerrado"));
        System.out.println("️ Cliente con membresía: " + usuario.tieneMembresia());
        System.out.println("Es empleado: " + usuario.esEmpleado());

        if (usuario.esEmpleado()) {
        System.out.println(" Acceso permitido (Es empleado).");
    } else if (usuario.tieneMembresia()) {
        if (horarioAtencion) {
            System.out.println(" Acceso permitido (Cliente con membresía y tienda abierta).");
        } else {
            System.out.println(" Acceso denegado (Tienda cerrada).");
        }
    } else {
        System.out.println("Acceso denegado (No tiene membresía ni es empleado).");
    }
    }
}
