package controlador;

import modelo.*;

public class ControladorVoluntario {

    public boolean asignarVoluntario(
            Voluntario voluntario,
            Tour tour) {

        if (voluntario.isDisponible()) {

            tour.agregarVoluntario(voluntario);
            voluntario.setDisponible(false);

            return true;
        }

        return false;
    }
}