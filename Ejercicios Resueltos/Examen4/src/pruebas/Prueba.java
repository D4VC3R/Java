package pruebas;
import cartas.Baraja;
import juego.Juego;

import java.util.Scanner;


public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Juego juego1 = new Juego();
        juego1.mensajeBienvenida();
        juego1.setMonedero(sc.nextInt());
        juego1.barajar();
        do {
            juego1.menu();
        }while(juego1.isCentinela() || juego1.getSaldo()<=0 || juego1.getPuntJugador()>7.5);





    }
}
