package controlador;

import vista.VistaPrincipal;

public class ControladorPrincipal {

    private VistaPrincipal vista;
    private boolean ejecutando;

    public ControladorPrincipal() {
        vista = new VistaPrincipal();
        ejecutando = true;
    }

    public void iniciar() {

        while (ejecutando) {

            int opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    vista.mostrarMensaje("Portal de Colegio");
                    break;

                case 2:
                    vista.mostrarMensaje("Portal de SEEA");
                    break;

                case 3:
                    vista.mostrarMensaje("Portal de Voluntarios");
                    break;

                case 4:
                    ejecutando = false;
                    break;

                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        }
    }
}