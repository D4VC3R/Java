package ejercicios.ej06.persona;

import java.util.Objects;

public class Persona implements Comparable {

    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Object o) {
        Persona persona = (Persona) o;
        return this.nombre.compareToIgnoreCase(persona.nombre);
    }
}
