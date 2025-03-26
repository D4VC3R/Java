package ejercicios.ej08.caja;

import ejercicios.ej08.enumerados.Unidades;
import ejercicios.ej08.etiqueta.Etiqueta;

public class Caja {
    protected int alto, ancho, fondo;
    private Unidades u;
    protected Etiqueta e;

    public Caja(int alto, int ancho, int fondo, Unidades u, Etiqueta e) {
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.u = u;
        this.e = e;
    }

    public Caja(int alto, int ancho, int fondo, Unidades u) {
        this(alto, ancho, fondo, u , null);
    }

    protected double getVolumen(){
        double vol = ancho*alto*fondo;
        if (u.name().equalsIgnoreCase(Unidades.CM.name()))
            return vol/1000000;
        else
            return vol;
    }


    @Override
    public String toString() {
        return "Caja:" +
                "Volumen : "+getVolumen()+
                ", Unidades: " + u +
                ", etiqueta: " + e;
    }
}
