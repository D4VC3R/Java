/*Calcula el mayor de dos números introducidos por teclado. Si son iguales lo
tendrá que indicar.*/
import java.util.Scanner;
public class Actividad02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Número: ");
        n1 = sc.nextInt();
        System.out.print("Número: ");
        n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println(n1 + " es mayor que " + n2 + ".");
        }else if(n1<n2){
            System.out.println(n2 + " es mayor que " + n1 + ".");
        }else
            System.out.println(n1 + " y " + n2 + " son iguales.");

    }
}
