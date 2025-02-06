package prueba;

import ejercicio8.Baraja;
import ejercicio8.Carta;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaBaraja {
    public static void main(String[] args) {

        Baraja david = new Baraja();
        ArrayList<Carta> cartas = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            cartas.add(getCarta(david));
        }
    }

    private static Carta getCarta(Baraja david) {
        Iterator it = david.getCartas().iterator();
        Carta c=null;
        int numeroCarta;
        int pos = getNumeroAleatorio(1,david.getNumeroCartasBaraja());
        int cont=0;
        while(cont<pos&&it.hasNext()){
            c = it.next();
            cont++;
        }
        

    }

    private static int getNumeroAleatorio(int i, int numeroCartasBaraja) {
        return (int)(Math.random()*(numeroCartasBaraja-i)+i);
    }


}
