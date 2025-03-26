package instrumento;

import enumerados.NOTAS;
import instrumento.excepciones.MaximoNotasAlcanzadoException;

import java.util.ArrayList;

public abstract class Instrumento {

    protected ArrayList<NOTAS> notasMusicales;
    protected static final int MAXNOTAS = 100;

    public Instrumento() {
        this.notasMusicales = new ArrayList<>();
    }

    public void add(NOTAS nota) throws MaximoNotasAlcanzadoException {
        if (notasMusicales.size()<100){
            notasMusicales.add(nota);
        }else{
            throw new MaximoNotasAlcanzadoException();
        }
    }

    protected abstract String interpretar();

    public ArrayList<NOTAS> getNotasMusicales() {
        return notasMusicales;
    }
}
