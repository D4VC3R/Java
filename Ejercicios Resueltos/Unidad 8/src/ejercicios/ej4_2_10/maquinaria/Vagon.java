package ejercicios.ej4_2_10.maquinaria;

import ejercicios.ej4_2_10.enumerados.Mercancia;

class Vagon {

    private final static int CARGA_MAX=200;
    private int carga;
    private Mercancia mercancia;


    public Vagon(int carga, Mercancia mercancia) {
        this.carga = carga;
        this.mercancia = mercancia;
    }

    public void anyadirCarga(int carga) {
        if (CARGA_MAX>=carga+getCarga())
            this.carga += carga;
        else
            this.carga = CARGA_MAX;
    }

    public void setMercancia(Mercancia mercancia) {
        this.mercancia = mercancia;
    }

    public int getCapacidadActual() {
        return (carga*100)/CARGA_MAX;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "\n---------------------\n|\t\tVagon\t\t|\n---------------------\n" +
                "Carga: " + carga +
                "\nCapacidad total: "+ CARGA_MAX + "\n" + getCapacidadActual() +"% de la capacidad ocupado con "+
                 mercancia + ".";
    }
}
