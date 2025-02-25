package ejercicios.ej02.excepciones;

public class FranjaInvalidaException extends Exception {
    public FranjaInvalidaException() {
        super("Franja inválida, inserte AM o PM.");
    }
}
