import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.print("Potencia: ");
        int potencia = sc.nextInt();

        int total=1;

        for(int cont = 1; cont <= potencia; cont++) {
            total *= num;
        }
        System.out.println(total);
    }
}
