package ejercicios.ej4_2_10.maquinaria;

import ejercicios.ej4_2_10.enumerados.Mercancia;
import ejercicios.ej4_2_10.personal.Maquinista;
import ejercicios.ej4_2_10.personal.Mecanico;

import java.util.ArrayList;
import java.util.TreeSet;

public class Tren {

    private Locomotora locomotora;
    private ArrayList<Vagon> vagon;
    private Maquinista maquinista;
    private int vagones;
    private static final int VAGONES_MAX = 5;

    public Tren(Locomotora locomotora) {
        this.locomotora = locomotora;
        this.vagon = new ArrayList<>();
    }

    public void setMecanico(Mecanico mecanico){
        this.locomotora.AsignarMecanico(mecanico);
    }

    public void getInfoVagones(){
        if(!vagon.isEmpty()){
            for (Vagon v: vagon) {
                System.out.println(v);
            }
        }else
            System.out.println("Sin vagones.");
    }

    private int setCargaVagon(int carga){
        return carga;
    }
    private Mercancia setMercanciaVagon(Mercancia mercancia){
        return mercancia;
    }

    public void anyadirVagon(int carga, Mercancia mercancia) {
        if (vagones < VAGONES_MAX) {
            Vagon v = new Vagon(setCargaVagon(carga),setMercanciaVagon(mercancia));
            this.vagon.add(v);
            vagones++;
        }
    }

    public void setMaquinista(Maquinista maquinista){
        this.maquinista = maquinista;
    }

    public int getVagones() {
        return vagones;
    }

    @Override
    public String toString() {
        return "----------------------------\n|\tINFORMACION DEL TREN\t|\n----------------------------\n"+
                maquinista.toString()+"\n"+
                locomotora.toString()+"\n"+
                "---------------------\nTotal de vagones: "+vagones+
                vagon;
    }
}
