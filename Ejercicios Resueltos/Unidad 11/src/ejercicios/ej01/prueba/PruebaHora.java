package ejercicios.ej01.prueba;

import ejercicios.ej01.hora.Hora;

public class PruebaHora {
    public static void main(String[] args) {

        Hora h = new Hora(23,59);
        System.out.println(h);
        h.inc();
        System.out.println(h);

    }
}
