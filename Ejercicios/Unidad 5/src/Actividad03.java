/*Realizar un programa que lea 3 números y nos diga cuál es el mayor*/
import java.util.Scanner;
public class Actividad03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Número 1: ");
        n1 = sc.nextInt();
        System.out.print("Número 2: ");
        n2 = sc.nextInt();
        System.out.print("Número 3: ");
        n3 = sc.nextInt();

        if((n1>n2) && (n1>n3)){
            System.out.println(n1+ " es el número mayor.");
        }else if((n2>n1) && (n2>n3)){
            System.out.println(n2+ " es el número mayor.");
        }else System.out.println(n3+ " es el número mayor.");
    }
}