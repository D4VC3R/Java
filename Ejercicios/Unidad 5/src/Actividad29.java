/*Haz un programa que eleve un número a una potencia*/
import java.util.Scanner;
public class Actividad29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
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
