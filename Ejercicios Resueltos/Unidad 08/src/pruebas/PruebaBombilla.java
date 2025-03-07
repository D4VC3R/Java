package pruebas;

import ejercicios.Bombilla;

public class PruebaBombilla {
    public static void main(String[] args) {

        Bombilla luz1 = new Bombilla();
        Bombilla luz2 = new Bombilla();

        System.out.println("Luz 1: " + luz1.estadoBombilla());
        luz1.encender();
        System.out.println("Luz 1: " + luz1.estadoBombilla());
        System.out.println("Luz 2: " + luz2.estadoBombilla());
        Bombilla.cortarLuz();
        luz2.encender();
        System.out.println("Luz 1: " + luz1.estadoBombilla());
        System.out.println("Luz 2: " + luz2.estadoBombilla());
        Bombilla.restaurarLuz();
        System.out.println("Luz 1: " + luz1.estadoBombilla());
        System.out.println("Luz 2: " + luz2.estadoBombilla());
        luz2.apagar();
        System.out.println("Luz 1: " + luz1.estadoBombilla());
        System.out.println("Luz 2: " + luz2.estadoBombilla());
        luz2.apagar();


    }
}
