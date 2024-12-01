import java.util.Scanner;
public class Actividad23invertida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura, i, j;

        do {
            System.out.print("Altura: ");
            altura = sc.nextInt();
        }while(altura<=0);

        for (i=altura;i>0;i--){

            for(j=i;j>0;j--){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}

