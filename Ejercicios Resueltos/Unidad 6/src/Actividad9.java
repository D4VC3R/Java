import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        
        Actividad9 programa = new Actividad9();
        programa.inicio();
    }

    private void inicio() {

        int[] num = getArray(8);
        String resultado;

        rellenarArray(num);
        resultado = getResultado(num);
        imprimirPantalla(resultado);


    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private String getResultado(int[] num) {
        String resultado = "";
        for (int i=0;i< num.length;i++){
            if(isPositivo(num[i])) {
                resultado += num[i]+" Es par.\n";
            }else
                resultado += num[i] + " Es impar\n";
        }
        return resultado;
    }

    private boolean isPositivo(int i) {
        return i%2==0;
    }


    private void rellenarArray(int[] num) {
        Scanner sc = new Scanner(System.in);

        for (int i=0;i< num.length;i++){
            System.out.print("Número "+(i+1)+": ");
            num[i] = sc.nextInt();
        }
    }

    private int[] getArray(int i) {
        return new int[i];
    }
}
