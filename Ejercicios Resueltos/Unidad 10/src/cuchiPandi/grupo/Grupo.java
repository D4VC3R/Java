package cuchiPandi.grupo;

import cuchiPandi.persona.Persona;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


public class Grupo implements Serializable {
    private Collection<Persona> grupo;

    public Collection<Persona> getGrupo() {
        return grupo;
    }

    public Grupo() {
        this.grupo = new ArrayList<>();
    }
    public void add(Persona p){
        grupo.add(p);
    }

    @Override
    public String toString() {
        String cad = "";
        for(Persona persona:grupo){
            cad += persona+"\n";
        }
        return cad;
    }
}
