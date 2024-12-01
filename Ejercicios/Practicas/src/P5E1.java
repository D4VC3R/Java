import java.util.Scanner;

public class P5E1 {
    public static void main(String[] args) {

        P5E1 programa = new P5E1();
        programa.inicio();
    }

    private void inicio() {

        int n;
        String inverso;

        do {
            n = getNumero();
            if (n<0)
                imprimirPantalla("El número debe ser positivo.\n");
        }while(!isPositivo(n));
        inverso = getInverso(n);
        imprimirPantalla("Número: "+n+ "\nInverso: "+inverso);

    }

    private String getInverso(int n) {
        int digito;
        String inverso="";

        if (n==0)
            inverso +=n;
        else

            do {
            digito = (n%10);
            n = (n/10);
            inverso += digito;
                if (n/10==0)
                    inverso+=n;
            }while (n/10!=0);

        return inverso;
    }

    private boolean isPositivo(int n) {
        return (n>=0);
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce un número: ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }
}
