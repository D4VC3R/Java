import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, digitos=0;

        System.out.print("Número: ");
        n1 = sc.nextInt();

        if(n1<0){
            n1=n1*-1;
        }else if(n1==0){
            digitos=1;
        }
        while(n1!=0){
            n1=n1/10;
            digitos++;
        }
        System.out.println(digitos);


    }
}
