package actividades.ej01.excepciones;

public class LimiteDeEdadException extends Exception {
    public LimiteDeEdadException() {
        super("No hay nadie tan viejo.\n");
    }
}
