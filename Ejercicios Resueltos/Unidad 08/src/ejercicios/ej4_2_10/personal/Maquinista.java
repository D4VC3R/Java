package ejercicios.ej4_2_10.personal;

import ejercicios.ej4_2_10.enumerados.Rangos;

public class Maquinista {

    private String nombre;
    private final String DNI;
    private double sueldo;
    private Rangos rango;


    public Maquinista(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public Maquinista(String nombre, String DNI, double sueldo, Rangos rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "------------------------\n|\t\tMaquinista\t\t|\n------------------------\n" +
                "Nombre: " + nombre + "\n" +
                "DNI: " + DNI +
                "\nSueldo: " + sueldo +
                "\nRango: " + rango;
    }
}
