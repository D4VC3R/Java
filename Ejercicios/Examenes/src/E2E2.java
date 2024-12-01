import java.util.Scanner;

public class E2E2 {
    public static void main(String[] args) {

        int n, i, contPositivo = 0, contNegativo = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitamos datos fuera del bucle
        System.out.println("Ingrese varios valores, termina con cero:");

        //Comprobamos el número y lo acumulamos donde corresponda.
        do {
            n = sc.nextInt();
            if (n > 0)
                contPositivo++;
            else
                contNegativo++;
        } while (n != 0);

        //Imprimimos tantos asteríscos como números de cada tipo se hayan introducido.
        System.out.print("\nPositivos: ");
        for (i = 1; i <= contPositivo; i++) {
            System.out.print("*");
        }
        System.out.print("\nNegativos: ");
        for (i = 1; i < contNegativo; i++) {
            System.out.print("*");
        }
    }
}
