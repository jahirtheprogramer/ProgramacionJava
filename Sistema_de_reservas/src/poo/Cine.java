/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author SENA
 */
import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombre;
    private List<Sala> salas;

    public Cine(String nombre) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
    }
    public String getNombre() {
    return nombre;
}
     

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    public Sala getSala(int idSala) {
        for (Sala sala : salas) {
            if (sala != null) {
                return sala;
            }
        }
        return null;
    }
}

