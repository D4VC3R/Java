package enumerados;

public enum Palo {
    BASTOS, COPAS, ESPADAS, OROS;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
