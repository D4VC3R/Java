package mascota;

import java.io.Serializable;

public class Mascota implements Serializable {
    private String tipus;
    private int numeroPates;

    public int getNumeroPates() {
        return numeroPates;
    }

    public String getTipus() {
        return tipus;
    }

    public Mascota(String tipus, int numeroPates) {
        this.tipus = tipus;
        this.numeroPates = numeroPates;
    }

    public Mascota() {
        this("gat",4);
    }

    @Override
    public String toString() {
        return "Mascota: " + tipus + " - " + numeroPates + " pates.";
    }
}
