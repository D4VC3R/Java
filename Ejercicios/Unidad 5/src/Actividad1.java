/*Realizar un programa que lea dos números y nos diga si son o no iguales.*/
import java.util.Scanner;
public class Actividad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Número: ");
        n1 = sc.nextInt();
        System.out.print("Número: ");
        n2 = sc.nextInt();

        if(n1 == n2)
            System.out.println(n1+ " y " +n2+ " son iguales.");
        else System.out.println(n1+ " y " +n2+ " no son iguales.");
    }

}
