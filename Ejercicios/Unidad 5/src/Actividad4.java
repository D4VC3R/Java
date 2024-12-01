import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n1, n2;

            System.out.print("Número 1: ");
            n1 = sc.nextInt();
            System.out.print("Número 2: ");
            n2 = sc.nextInt();

            if(n1%n2==0){
                System.out.println(n1+ " es divisible por "+n2);
            }else if(n2%n1==0){
                System.out.println(n2+ " es divisible por "+n1);
            }else System.out.println("Los números introducidos no son divisibles.");
    }

}
