package cuchiPandi.enumerado;

public enum TipoMascota {
    PERRO, GATO, PERIQUITO, HAMSTER;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
