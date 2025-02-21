package ejerciciosMaps.ej21;


public class PruebaAjedrez {
    public static void main(String[] args) {

        PruebaAjedrez programa = new PruebaAjedrez();
        programa.inicio();
    }

    private void inicio() {
        Juego j = new Juego();

        System.out.println("Fichas capturadas por el jugador:");
        j.capturar();
    }
}
