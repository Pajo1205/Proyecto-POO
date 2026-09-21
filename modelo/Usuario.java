package modelo;

public abstract class Usuario {

    protected int id;
    protected String nombre;
    protected String correo;
    protected String password;

    public Usuario(int id, String nombre, String correo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean iniciarSesion(String correo, String password) {
        return this.correo.equals(correo)
                && this.password.equals(password);
    }
}