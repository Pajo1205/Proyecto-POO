package modelo;

public class EncargadoSEEA extends Usuario {

    public EncargadoSEEA(int id, String nombre,
                         String correo, String password) {

        super(id, nombre, correo, password);
    }

    public void aprobarSolicitud(Solicitud solicitud) {
        solicitud.setEstado(EstadoSolicitud.APROBADA);
    }

    public void rechazarSolicitud(Solicitud solicitud) {
        solicitud.setEstado(EstadoSolicitud.RECHAZADA);
    }
}