import java.util.Scanner;

public class MedioRombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, i, j;

        do {
            System.out.print("Valor de la fila mas larga: ");
            valor = sc.nextInt();
        } while (valor <= 0);

        for (i = 1; i <= valor; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("a");
            }
            System.out.println();
        }
        for (i = valor; i > 0; i--) {

            for (j = i-1; j > 0; j--) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
