package ejercicio8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baraja {

    HashSet<Carta> cartas;

    public Baraja() {
        cartas = new HashSet<>();
        for (Palos p:Palos.values()){
            for (int i = 1; i <= 12; i++) {
                cartas.add(new Carta(p,i));
            }
        }
    }

    public HashSet<Carta> getCartas() {
        return cartas;
    }

    public int getNumeroCartasBaraja(){
        return cartas.size();
    }
}
