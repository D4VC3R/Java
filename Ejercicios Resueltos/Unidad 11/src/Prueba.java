import enumerados.NOTAS;
import instrumento.excepciones.MaximoNotasAlcanzadoException;
import piano.Piano;

public class Prueba {
    public static void main(String[] args) {

        Piano p = new Piano();
        try {
            p.add(NOTAS.DO);
        } catch (MaximoNotasAlcanzadoException e) {
            System.out.println(e.getMessage());
        }
    }
}
