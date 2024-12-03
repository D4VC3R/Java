import java.util.Scanner;

public class Actividad07copia {
    public static void main(String[] args) {

        Actividad07copia programa = new Actividad07copia();
        programa.inicio();
    }

    private void inicio() {

        int min=0, max=20, longitud=100, v1, v2;

        int n[] = crearArray(longitud);
        rellenarArray(n, max, min);
        imprimirArray(n);
        imprimirPantalla(imprimirArray(n));
        v1 = getNumero();
        v2 = getNumero();
        cambiarValores(n, v1, v2);
    }

    private void cambiarValores(int[] n, int v1, int v2) {

        for (int i = 1; i < n.length; i++) {
        }
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private String imprimirArray(int[] n) {
        String resultado = "";
        for (int i=0;i<n.length;i++){
            resultado += n[i]+" ";
        }
        return resultado;
    }


    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private void rellenarArray(int[] n, int max, int min) {
        for (int i=0;i<n.length;i++){
            n[i] = getAleatorio(max, min);
        }
    }

    private int getAleatorio(int max, int min) {
        return (int)(Math.random()*(max-min+1)+min);
    }

    private int[] crearArray(int longitud) {
        return new int[longitud];
    }
}
