package cartas;

import enumerados.Palo;

import java.util.*;

public class Baraja {

    //Un SET seria mes correcte per a evitar els duplicats pero en el constructor m'asegure de que no hi ha cap.

    ArrayList<Carta> baraja;
    ArrayList<Carta> sacadas;

    public Baraja() {
        this.baraja = new ArrayList<Carta>();
        this.sacadas = new ArrayList<Carta>();

        for (Palo palo:Palo.values()){
            for (int i = 1; i <= 10 ; i++) {
                baraja.add(new Carta(palo,i));
            }
        }
    }

    public void mostrarCartasSacadas(){
        System.out.println("Cartas sacadas:\n--------------------");
        for (Carta carta : sacadas){
            System.out.println(carta);
        }
        System.out.println("********************");
    }

    public void ordenar(){
        Collections.sort(baraja);
    }

    public void mezclar(){
        Collections.shuffle(baraja);
    }

    public void mostrarBaraja(){
        System.out.println("Cartas en la baraja:\n--------------------");
        for (Carta carta : baraja){
            System.out.println(carta);
        }
        System.out.println("********************");
    }

    public Carta sacarCarta(){
        Carta cartaSacada = baraja.removeFirst();
        sacadas.add(cartaSacada);
        return cartaSacada;
    }

    @Override
    public String toString() {
        String cad = "";
        for (Carta c : baraja) {
            cad += c + "\n";
        }
        return cad;
    }
}
