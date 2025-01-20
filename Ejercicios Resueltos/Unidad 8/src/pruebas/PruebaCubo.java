package pruebas;
import Utensilios.Cubo;

public class PruebaCubo {

    public static void main(String[] args) {

        PruebaCubo programa = new PruebaCubo();
        programa.inicio();

    }

    private void inicio() {

        Cubo cubo1 = new Cubo(8, "plástico");
        cubo1.setContenidoLiquido(2);
        cubo1.setContenidoLiquido(12);
        imprimirCubo(cubo1);
    }

    private void imprimirCubo(Cubo cubo1) {
        int altura = cubo1.getCapacidadMax();

        for (int i = altura; i >= 0; i--) {
            if (i == 0) {
                System.out.println("************");

            } else if (i <= cubo1.getContenidoLiquido()) {
                System.out.println("*~~~~~~~~~~*");

            } else {
                System.out.println("*          *");
            }
        }
        System.out.println();
    }

}
