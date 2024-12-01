import java.util.Scanner;

public class P3E1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, i;
        char respuesta;

        do {

            //Lectura del número entero positivo
            do {
                System.out.print("Número entero positivo: ");
                num = sc.nextInt();
            } while (num <= 0);

            System.out.print("Divisores de " + num + ": ");

            //Cálculo de los divisores
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
            //Finalizar o volver a comenzar
            System.out.print("\nQuieres volver a calcular los divisores de un número (s/n)? ");
            respuesta = sc.next().charAt(0);
        }while (respuesta == 's');
    }
}
