package ejercicios.ej4_2_10;

import ejercicios.ej4_2_10.enumerados.Especialidad;
import ejercicios.ej4_2_10.enumerados.Mercancia;
import ejercicios.ej4_2_10.enumerados.Rangos;
import ejercicios.ej4_2_10.maquinaria.Locomotora;
import ejercicios.ej4_2_10.maquinaria.Tren;
import ejercicios.ej4_2_10.personal.Maquinista;
import ejercicios.ej4_2_10.personal.Mecanico;


public class Prueba {
    public static void main(String[] args) {


        Tren tren = new Tren(new Locomotora("12F", 100,1990));
        tren.getInfoVagones();
        tren.anyadirVagon(20, Mercancia.VOLUMINOSA);
        tren.anyadirVagon(69,Mercancia.DELICADA);
        tren.anyadirVagon(193,Mercancia.PERECEDERA);
        tren.anyadirVagon(88,Mercancia.DELICADA);
        tren.anyadirVagon(173,Mercancia.PERECEDERA);

        Maquinista maqui = new Maquinista("Pancho","432F",1250.97, Rangos.NOVATO);
        Mecanico fiti = new Mecanico("Fiti", "123", Especialidad.HIDRAULICA);

        tren.getInfoVagones();
        tren.setMaquinista(maqui);
        tren.setMecanico(fiti);
        System.out.println(tren);
    }
}
