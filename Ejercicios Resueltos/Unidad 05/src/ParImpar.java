/**/
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Número positivo diferente de 0: ");
            n = sc.nextInt();
        }while (n<=0);

        if (n%2==0){
            System.out.print(n+ " es par.");
        }else System.out.println(n + " es impar.");

    }
}
