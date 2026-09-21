package modelo;

import java.util.ArrayList;

public class Tour {

    private int id;
    private Solicitud solicitud;
    private ArrayList<Voluntario> voluntarios;

    public Tour(int id, Solicitud solicitud) {
        this.id = id;
        this.solicitud = solicitud;
        this.voluntarios = new ArrayList<>();
    }

    public void agregarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    public int calcularVoluntariosNecesarios() {

        int estudiantes = solicitud.getCantidadEstudiantes();

        int necesarios = (int) Math.ceil(estudiantes / 10.0);

        // voluntario adicional de respaldo
        return necesarios + 1;
    }

    public int getCantidadVoluntarios() {
        return voluntarios.size();
    }
}