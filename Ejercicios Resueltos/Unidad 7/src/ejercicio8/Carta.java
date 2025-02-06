package ejercicio8;

public class Carta{

    //Atributos
    private Palos palo;
    private int num;

    //Constructor
    public Carta(Palos palo, int num) {
        this.palo = palo;
        this.num = num;
    }

    //Metodos



    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return num;
    }

    public void setNumero(String numero) {
        this.num = num;
    }

}
