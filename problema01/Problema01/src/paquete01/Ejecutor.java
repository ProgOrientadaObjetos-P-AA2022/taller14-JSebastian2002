package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Enlace;
import paquete03.Trabajadores;

/**
 *
 * @author E.N.D
 */
public class Ejecutor {

    public static void main(String[] args) {

        Enlace enlace = new Enlace();
        Scanner entrada = new Scanner(System.in);
        String cd;
        String correo;
        String nb;
        double sueldo;
        int sueldoM;

        int seleccion;

        do {
            System.out.println("Ingrese cedula del trabajador");
            cd = entrada.nextLine();
            System.out.println("Ingrese nombre del trabajador");
            nb = entrada.nextLine();
            System.out.println("Ingrese correo del trabajador");
            correo = entrada.nextLine();
            System.out.println("Ingrese sueldo");
            sueldo = Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el mes de sueldo");
            sueldoM = Integer.parseInt(entrada.nextLine());
            Trabajadores st = new Trabajadores(cd, nb, correo, sueldo, sueldoM);
            enlace.insertarSueldoTrabajadores(st);
            System.out.println("Ingrese 0 para salir");
            seleccion = Integer.parseInt(entrada.nextLine());
        } while (seleccion != 0);

    }
}
