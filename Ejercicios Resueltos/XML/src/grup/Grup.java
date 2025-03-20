package grup;

import personal.Persona;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Grup implements Serializable {
    private Collection<Persona> grup;

    public Grup() {
        this.grup = new HashSet<>();
    }

    public void add(Persona persona) {
        grup.add(persona);
    }

    public Collection<Persona> getGrup() {
        return grup;
    }
    public int longitud(){
        return grup.size();
    }

    @Override
    public String toString() {
        String aux = "";
        for (Persona persona:grup)
            aux += persona+"\n";
        return aux;
    }
}
