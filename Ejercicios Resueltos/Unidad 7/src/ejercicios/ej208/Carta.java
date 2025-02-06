package ejercicios.ej208;

public class Carta implements Comparable<Carta> {

    //Atributos

    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        String cad = "";

            switch (getNumero()) {
                case 1:
                    cad+="As";
                    break;
                case 10:
                    cad += "Sota";
                    break;
                case 11:
                    cad += "Caballo";
                    break;
                case 12:
                    cad += "Rey";
                    break;
                default:
                    cad += numero;
            }
            cad = cad + " de " + getPalo();

        return cad;
    }

    @Override
    public int compareTo(Carta otraCarta) {
        if (this.getPalo().ordinal() - otraCarta.getPalo().ordinal()==0) {
            return this.getNumero() - otraCarta.getNumero();
        }else
            return getPalo().ordinal() - otraCarta.getPalo().ordinal();
    }
}
