package juego;

public class Monedero {

    private int euros;

    public Monedero() {
        this.euros = 0;
    }

    public void anyadirDinero(int euros){
        this.euros += euros;
    }
    public void restarDinero(){
        this.euros -= euros;
    }

    public int getEuros() {
        return euros;
    }

    public void setEuros(int euros) {
        this.euros = euros;
    }
}
