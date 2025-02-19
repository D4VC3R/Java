package actividades.ej01.excepciones;

public class NumeroNegativoException extends Exception {
    public NumeroNegativoException() {
        super("La edad no puede ser 0 ni número negativo.\n");
    }
}
