import java.util.Scanner;

public class TrianguloRect{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura, i, j;

        do {
            System.out.print("Altura: ");
            altura = sc.nextInt();
        }while(altura<=0);

        for (i=1;i<=altura;i++){

            for(j=1;j<=i;j++){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
