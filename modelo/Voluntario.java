package modelo;

public class Voluntario extends Usuario {

    private String carnet;
    private boolean disponible;

    public Voluntario(int id, String nombre, String correo,
                      String password, String carnet) {

        super(id, nombre, correo, password);

        this.carnet = carnet;
        this.disponible = true;
    }

    public String getCarnet() {
        return carnet;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}