package juego;

import cartas.Baraja;
import cartas.Carta;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Juego {

    private final double PUNTUACION_OBJETIVO = 7.5;
    private double puntJugador;
    private double puntMaquina;
    private Baraja baraja;
    private Monedero monedero;
    private int apuesta;
    private Set<Carta> cartasJugador;
    private boolean centinela;

    public Juego() {
        this.baraja = new Baraja();
        this.monedero = new Monedero();
        this.cartasJugador = new HashSet<>();
        this.centinela = true;
    }

    public boolean isCentinela() {
        return centinela;
    }

    private void setPuntJugador(double puntJugador) {
        this.puntJugador += puntJugador;
    }

    private void setPuntMaquina(double puntMaquina) {
        this.puntMaquina = puntMaquina;
    }
    public void mensajeBienvenida(){
        System.out.print("Bienvenido al 7 y media.\n" +
                "¿Con cuánto dinero vas a empezar a jugar?\n" +
                "Ingresar dinero: ");
    }
    public void setMonedero(int dinero){
        this.monedero.anyadirDinero(dinero);
    }

    public int getSaldo() {
        return this.monedero.getEuros();
    }

    public void barajar(){
        baraja.mezclar();
    }
    public void pedirCarta(){
       Carta c = (baraja.sacarCarta());
       cartasJugador.add(c);
       setPuntJugador(c.getValor());
    }

    private void getPuntuacion(){
        for (Carta c: cartasJugador){
            setPuntJugador(c.getValor());
        }
    }

    public void verMano(){
        System.out.println("Tus cartas: ");
        for (Carta c: cartasJugador){
            System.out.print(c+" ");
        }
        System.out.println();
    }

    public double getPuntJugador() {
        return puntJugador;
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        byte opcion;

        System.out.println("1- Pedir carta.\n2- Ver cartas en la mano." +
                "\n3- Ver tu puntuación actual.\n4- Consultar saldo. \n5- Plantarse.");
        opcion = sc.nextByte();
        switch(opcion){
            case 1 : pedirCarta();
            break;
            case 2 : verMano();
            break;
            case 3 : System.out.println("Puntuación: " + getPuntJugador());
            break;
            case 4 : System.out.println("Saldo actual: " + getSaldo());
            break;
            default: centinela = false;
        }

    }


}

