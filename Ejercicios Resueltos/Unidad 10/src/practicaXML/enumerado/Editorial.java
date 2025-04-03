package practicaXML.enumerado;

public enum Editorial {
    ANAYA("Anaya"),
    SM("SM"),
    ALIANZA("Alianza"),
    PLANETA("Planeta"),
    ESPASA("Espasa"),
    RBA("RBA");

    private String nombre;

    Editorial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
