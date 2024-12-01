import java.util.Scanner;

public class E2E3b {
    public static void main(String[] args) {

        int n, i, fibonacci = 0, numAnterior = 0, numActual = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        n = sc.nextInt();

        //Descartamos caso especial
        if (n == 1)
            System.out.print("n: " + n + "\nF" + n + ": " + numActual);

            //Calculamos el valor Fibonacci de n
        else {
            for (i = 1; i < n; i++) {

                fibonacci = (numAnterior + numActual);
                numAnterior = numActual;
                numActual = fibonacci;
            }

            //Imprimimos el valor de Fibonacci solicitado
            System.out.print("n: " + n + "\nF" + n + ": " + fibonacci);
        }
    }
}
