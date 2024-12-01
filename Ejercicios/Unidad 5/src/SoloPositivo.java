import java.util.Scanner;

public class SoloPositivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, alto=-1, bajo=Integer.MAX_VALUE;

        do{
            System.out.print("Digite un valor: ");
            num1 = sc.nextInt();
            if (num1 > alto)
                alto = num1;
            if (num1 < bajo)
                bajo = num1;

            System.out.print("Digite un valor: ");
            num1 = sc.nextInt();
        }while(num1>=0);

        System.out.println("Más alto: "+alto+" \nMás bajo: "+bajo);
    }
}
