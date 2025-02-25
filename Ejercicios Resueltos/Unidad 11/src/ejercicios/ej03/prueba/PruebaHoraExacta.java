package ejercicios.ej03.prueba;

import ejercicios.ej03.horaExacta.HoraExacta;

public class PruebaHoraExacta {
    public static void main(String[] args) {

        HoraExacta h = new HoraExacta(23,59,59);
        System.out.println(h);
        h.inc();
        System.out.println(h);
        HoraExacta h2 = new HoraExacta(0,0,0);
        System.out.println(h.equals(h2));
    }
}
