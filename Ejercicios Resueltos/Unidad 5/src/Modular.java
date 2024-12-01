import java.util.Scanner;

public class Modular {
    public static void main(String[] args) {

        int n;

        do {
            n = getNumero();
        }while (!isPositivo(n));

        if(isPar(n)){
            imprimirPantalla();
        }else
            imprimirPantalla();

    }

    private static void imprimirPantalla() {
        System.out.println();
    }

    private static boolean isPar(int n) {
        if (n%2==0)
            return true;
        else
            return false;
    }

    private static boolean isPositivo( int n) {
        if (n>0)
            return true;
        else
            return false;
    }

    private static int getNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        return sc.nextInt();

    }
}
