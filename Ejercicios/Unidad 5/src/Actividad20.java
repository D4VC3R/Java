/*Haz un programa que lea un número entero desde el teclado y escriba el
número de cifras que tiene. Tened en cuenta que se considera que el valor 0
tiene una cifra*/
import java.util.Scanner;
public class Actividad20 {
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
