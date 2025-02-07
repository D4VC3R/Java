package ejercicios.ej4_2_10.personal;

import ejercicios.ej4_2_10.enumerados.Especialidad;

public class Mecanico {

    private String nombre, telefono;
    private Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public Mecanico(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "\n------------------------\n|\t\tMecanico\t\t|\n------------------------\n" +
                "Nombre: " + nombre +
                "\nTelefono: " + telefono +
                "\nEspecialidad: " + especialidad;
    }
}
