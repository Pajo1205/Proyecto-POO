package modelo;

public class Taller {

    private int id;
    private String nombre;
    private String carrera;
    private int capacidadMaxima;
    private int duracionMinutos;

    public Taller(int id, String nombre,
                  String carrera, int capacidadMaxima) {

        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.capacidadMaxima = capacidadMaxima;
        this.duracionMinutos = 60;
    }

    public boolean tieneCapacidad(int estudiantes) {
        return estudiantes <= capacidadMaxima;
    }
}