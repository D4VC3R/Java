import java.util.Scanner;
public class Actividad18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, cont1, cont2;

        do {
            System.out.print("Número 1: ");
            n1 = sc.nextInt();
            System.out.print("Número 2: ");
            n2 = sc.nextInt();
            if (n1 >= n2)
                System.out.println("Error.");
        } while (n1 > n2);


        System.out.println("Múltiplos ascendentes:");
        for (cont1 = n1; cont1 <= n2; cont1++) {
            if(n2%cont1==0)
                System.out.print(cont1 + " ");

        }
    }
}