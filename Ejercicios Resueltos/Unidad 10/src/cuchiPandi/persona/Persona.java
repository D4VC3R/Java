package cuchiPandi.persona;

import cuchiPandi.mascota.Mascota;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private Mascota mascota;

    public Persona(String nombre, int edad, Mascota mascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.mascota = mascota;
    }

    public Persona(String nombre, int edad) {
        this(nombre, edad,new Mascota());
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    @Override
    public String toString() {
        return "Persona: "+ nombre+";"+edad+" años -> "+mascota;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
