package modelo;

public class Solicitud {

    private int id;

    private Colegio colegio;
    private Horario horario;

    private int cantidadEstudiantes;
    private int cantidadProfesores;
    private String grado;
    private String transporte;

    private boolean solicitaTour;
    private boolean solicitaCharla;
    private boolean solicitaTaller;

    private EstadoSolicitud estado;

    public Solicitud(int id, Colegio colegio, Horario horario,
                     int cantidadEstudiantes,
                     int cantidadProfesores,
                     String grado,
                     String transporte) {

        this.id = id;
        this.colegio = colegio;
        this.horario = horario;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.cantidadProfesores = cantidadProfesores;
        this.grado = grado;
        this.transporte = transporte;

        this.estado = EstadoSolicitud.PENDIENTE;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }
}