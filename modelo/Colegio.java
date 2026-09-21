package modelo;

public class Colegio extends Usuario {

    private boolean aliado;
    private String telefono;
    private String direccion;

    public Colegio(int id, String nombre, String correo,
                   String password, boolean aliado,
                   String telefono, String direccion) {

        super(id, nombre, correo, password);

        this.aliado = aliado;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public boolean isAliado() {
        return aliado;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}