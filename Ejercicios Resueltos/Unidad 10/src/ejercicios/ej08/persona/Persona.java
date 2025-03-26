package ejercicios.ej08.persona;

import java.util.Objects;

public class Persona implements Comparable{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public int compareTo(Object o) {
        Persona otraPersona = (Persona)o;
        return this.nombre.compareTo(((Persona) o).nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
