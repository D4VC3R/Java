package piano;

import enumerados.NOTAS;
import instrumento.Instrumento;

public class Piano extends Instrumento {




    @Override
    protected String interpretar() {
        String partitura = "";
        for (NOTAS n:getNotasMusicales()){
            partitura += n.name() + " ";
        }
        return partitura;
    }
}
