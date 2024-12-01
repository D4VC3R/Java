import java.util.Scanner;

public class Ceros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positivos=0, negativos=0,num;


        do {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
        } while (num != 0);

        System.out.println("Positivos: " + positivos + "\nNegativos: " + negativos);

    }
}
