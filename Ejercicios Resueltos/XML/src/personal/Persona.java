package personal;

import mascota.Mascota;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable {
    private String nom;
    private int edat;
    private Mascota mascota;

    public Persona(String nom, Mascota mascota, int edat) {
        this.nom = nom;
        this.mascota = mascota;
        this.edat = edat;
    }

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
        mascota = new Mascota();
    }

    public Persona() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona: "+nom + ";" + edat+" -> "+mascota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edat == persona.edat && Objects.equals(nom, persona.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, edat);
    }
}
