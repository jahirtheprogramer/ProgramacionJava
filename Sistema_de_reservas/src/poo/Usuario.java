
package poo;


public class Usuario extends Persona {
    private int idUsuario;

    public Usuario(String nombre, int idUsuario) {
        super(nombre);
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}
