package ejercicios.ej208;

public class PruebaCartas {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();

        baraja.mostrarBaraja();
        baraja.mezclar();
        baraja.sacarCartas(10);
        baraja.mostrarBaraja();
        baraja.mostrarCartasSacadas();
        baraja.ordenar();
        baraja.mostrarBaraja();
    }
}
