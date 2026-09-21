package controlador;

import modelo.*;
import java.util.ArrayList;

public class ControladorTour {

    private ArrayList<Tour> tours;

    public ControladorTour() {
        tours = new ArrayList<>();
    }

    public void crearTour(Tour tour) {
        tours.add(tour);
    }

    public ArrayList<Tour> obtenerTours() {
        return tours;
    }
}