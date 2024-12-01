/**
indicar que número es mayor o si son iguales.
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Act2{
    public static void main(String args []){

    //definición de variables
    Scanner sc = new Scanner(System.in);
    int n1, n2;

    //lectura de los números
    System.out.print("Introduce un número: ");
    n1 = sc.nextInt();
    System.out.print("Introduce otro número: ");
    n2 = sc.nextInt();

    //Comprobación
    if(n1<n2){
        System.out.println(n1+ " es menor que "+n2);
    }else if (n1>n2){
        System.out.println(n1+" es mayor que "+n2);
    }else   System.out.println(n1+ " es igual que "+n2);

   }
}
