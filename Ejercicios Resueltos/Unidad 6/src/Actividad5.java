import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {

        Actividad5 programa = new Actividad5();
        programa.inicio();
    }

    private void inicio() {

        int[] numArray = getArray(10);
        int min, max;

        rellenarArray(numArray);
        min = getMinimo(numArray);
        max = getMaximo(numArray);

        imprimirResultado(getResultado(numArray, min, max));

    }

    private void imprimirResultado(String resultado) {
        System.out.println(resultado);

    }

    private String getResultado(int[] numArray, int min, int max) {
        String resultado = "";
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == min && numArray[i] == max) {
                resultado += numArray[i] + " mínimo y máximo\n";
            }else if (numArray[i] == max) {
                resultado += numArray[i] + " máximo\n";
            }else if (numArray[i] == min){
                    resultado += numArray[i] + " mínimo\n";
            }else
                resultado += numArray[i]+ " \n";
        }
        return resultado;
    }

    private int getMinimo(int[] numArray) {
        int min=numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] < min) {
                min = numArray[i];
            }
        }
        return min;
    }

    private int getMaximo(int[] numArray) {
        int max=numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
        }
        return max;
    }

    private void rellenarArray(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = getNumero();
        }
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        return sc.nextInt();
    }


    private int[] getArray(int i) {
        return new int[i];
    }
}
