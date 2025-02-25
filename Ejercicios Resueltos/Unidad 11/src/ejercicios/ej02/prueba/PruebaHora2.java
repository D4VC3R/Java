package ejercicios.ej02.prueba;

import ejercicios.ej02.enumerados.Franja;
import ejercicios.ej02.hora2.Hora2;

public class PruebaHora2 {
    public static void main(String[] args) {

        Hora2 h = new Hora2(12,59, "pm");
        System.out.println(h);
        h.inc();
        System.out.println(h);
    }
}
