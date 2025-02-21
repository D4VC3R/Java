package ejerciciosMaps.ej21;

import java.util.*;

public class Juego {

    private Map<Pieza,Integer> piezas;
    private int capturasMax;

    public Juego() {
        this.piezas = new HashMap<>();
        this.capturasMax = getNumeroAleatorio(0,15);
        piezas.put(new Pieza("Peon"),8);
        piezas.put(new Pieza("Caballo"),2);
        piezas.put(new Pieza("Alfil"),2);
        piezas.put(new Pieza("Torre"),2);
        piezas.put(new Pieza("Dama"),1);
    }

    private int getNumeroAleatorio(int min, int max) {
        return (int)(Math.random()*(max-min)+min);
    }

    private Pieza getPiezaAleatoria(){
        List<Pieza> p = new ArrayList<>(piezas.keySet());

        int indiceAleatorio = getNumeroAleatorio(0,p.size());
        Pieza piezaAleatoria = p.get(indiceAleatorio);

        if (piezas.get(piezaAleatoria)>1) {
            piezas.put(piezaAleatoria, piezas.get(piezaAleatoria) - 1);
        }else{
            piezas.remove(piezaAleatoria);
        }
        return piezaAleatoria;

    }

    public void capturar(){
        int puntos=0;
        Pieza piezaObtenida;

        if (capturasMax==0){
            System.out.println("No has capturado nada, lo siento.");
        }else {
            for (int i = 0; i < capturasMax; i++) {
                piezaObtenida = getPiezaAleatoria();
                puntos += piezaObtenida.getValor();
                System.out.println(piezaObtenida);
            }
        }
        System.out.println("Puntos totales: "+puntos+" peones.");
    }


}
