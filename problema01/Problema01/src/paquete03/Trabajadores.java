/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete03;

/**
 *
 * @author E.N.D
 */
public class Trabajadores {

    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private int sueldoM;

    public Trabajadores(String cd, String nb, String cr, double sueldo,
            int mes) {
        
        cedula = cd;
        nombre = nb;
        correo = cr;
        sueldo = sueldo;
        sueldoM = mes;
        
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerCorreo(String c) {
        correo = c;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }

    public void establecerSueldoM(int c) {
        sueldoM = c;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public int obtenerSueldoM() {
        return sueldoM;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Mes del Sueldo: s\n",
                obtenerCedula(),
                obtenerNombre(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerSueldoM());

        return cadena;
    }
}