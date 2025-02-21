package excepciones;

public class EdadNegativaException extends RuntimeException {
    public EdadNegativaException() {
        super("La edad debe ser un número positivo.\n");
    }
}
