package ejercicios.ej08;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    ArrayList<Carta> baraja;
    ArrayList<Carta> sacadas;

    public Baraja() {
        this.baraja = new ArrayList<Carta>();
        this.sacadas = new ArrayList<Carta>();
        for (Palo palo:Palo.values()){
            for (int i = 1; i <= 12 ; i++) {
                baraja.add(new Carta(i,palo));
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
    public ArrayList<Carta> sacarCartas(int cantidad){
        ArrayList<Carta> cartasSeleccionadas = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            Carta cartaSacada = baraja.removeFirst();
            cartasSeleccionadas.add(cartaSacada);
            sacadas.add(cartaSacada);
        }
        return cartasSeleccionadas;
    }
}
