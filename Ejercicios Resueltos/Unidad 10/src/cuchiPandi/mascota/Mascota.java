package cuchiPandi.mascota;

import cuchiPandi.enumerado.TipoMascota;

import java.io.Serializable;

public class Mascota implements Serializable {
    private TipoMascota tipo;
    private int patas;

    public Mascota(TipoMascota tipo, int patas) {
        this.tipo = tipo;
        this.patas = patas;
    }

    public Mascota() {
        this(TipoMascota.GATO, 4);
    }

    @Override
    public String toString() {
        return "Mascota: "+this.tipo+" - " + this.patas+ " patas.";
    }

    public TipoMascota getTipo() {
        return tipo;
    }

    public int getPatas() {
        return patas;
    }
}
