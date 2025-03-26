package ejercicios.ej08.caja.carton;

import ejercicios.ej08.caja.Caja;
import ejercicios.ej08.enumerados.Unidades;
import ejercicios.ej08.etiqueta.Etiqueta;

public class CajaCarton extends Caja {

    private int etiqueta;
    private double area;
    private static double cartonTotal;

    public CajaCarton(int alto, int ancho, int fondo) {
        super(alto, ancho, fondo, Unidades.CM);
        this.area = ancho*alto*2+fondo*ancho+2+fondo*alto*2;
        cartonTotal += area;
    }


    @Override
    protected double getVolumen() {
        return super.getVolumen()*0.8;
    }

    @Override
    public String toString() {
        return "Volumen: "+super.getVolumen()
                +"\nVolumen real: "+this.getVolumen()
                +"\nCartón utilizado: "+this.area;
    }
}
