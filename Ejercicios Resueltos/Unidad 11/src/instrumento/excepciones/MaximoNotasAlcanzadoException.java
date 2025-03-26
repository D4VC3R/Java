package instrumento.excepciones;

public class MaximoNotasAlcanzadoException extends Exception {
    public MaximoNotasAlcanzadoException() {
        super ("Cantidad de notas máxima alcanzada. Nota no añadida.");
    }
}
