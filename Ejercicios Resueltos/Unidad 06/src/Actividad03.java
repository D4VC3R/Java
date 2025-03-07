import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {

        Actividad03 programa = new Actividad03();
        programa.inicio();
    }

    private void inicio() {

        String resultado;
        int [] array = getArray(10);
        rellenarArray(array);
        resultado = invertirArray(array);
        imprimirPantalla(resultado);



    }

    private String invertirArray(int[] array) {
        String resultado = "";
        for (int i = array.length-1; i >= 0; i--) {
            resultado += array[i] + " ";
        }
        return resultado;
    }


    private int getNumero() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            imprimirPantalla("Número " +(i+1)+": ");
            array[i] = getNumero();
        }

    }

    private int[] getArray(int i) {
        return new int[i];
    }


    private void imprimirPantalla(String s) {
        System.out.print(s);
    }
}
