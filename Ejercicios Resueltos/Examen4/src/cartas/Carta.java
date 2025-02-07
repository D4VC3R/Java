package cartas;

import enumerados.Palo;


public class Carta implements Comparable {

    private Palo palo;
    private int numero;
    private double valor;

    public Carta(Palo palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    private void setValorCartas(){
        switch(numero){
            case 8,9,10 : valor = 0.5;
            break;
            default: valor = numero;
        }
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String cad="";
        switch(numero){
            case 8 : cad = "Sota de "+palo;
            break;
            case 9 : cad = "Caballo de "+palo;
            break;
            case 10 : cad = "Rey de "+palo;
            break;
            default: cad = numero + " de " + palo;
        }
        return cad;
    }

    @Override
    public int compareTo(Object o) {
        if (this.palo.ordinal() - ((Carta)o).palo.ordinal() == 0) {
            return this.numero;
        } else
            return this.palo.ordinal() - ((Carta)o).palo.ordinal();
    }
}
