import java.util.Scanner;

public class SumaCercana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num1 = sc.nextInt();

        int suma=0, cont=0;

        System.out.print("Sucesión: ");

        while(suma<=num1){
            cont++;
            System.out.print(cont+" ");
            suma=suma+cont;
        }

        System.out.println("\nLa suma mas cercana es: "+(suma-cont));
    }
}
