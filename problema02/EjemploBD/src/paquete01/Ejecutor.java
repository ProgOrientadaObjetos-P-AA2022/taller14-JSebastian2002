package paquete01;

import paquete02.Enlace;

/**
 *
 * @author E.N.D
 */
public class Ejecutor {

    public static void main(String[] args) {
        Enlace c = new Enlace();

        for (int i = 0; i < c.obtenerDataCalificaciones().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataCalificaciones().get(i));
        }
    }
}
