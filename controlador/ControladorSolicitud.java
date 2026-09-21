package controlador;

import modelo.*;
import java.util.ArrayList;

public class ControladorSolicitud {

    private ArrayList<Solicitud> solicitudes;

    public ControladorSolicitud() {
        solicitudes = new ArrayList<>();
    }

    public void crearSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
    }

    public void cancelarSolicitud(Solicitud solicitud) {
        solicitud.setEstado(EstadoSolicitud.CANCELADA);
    }

    public ArrayList<Solicitud> obtenerSolicitudes() {
        return solicitudes;
    }
}