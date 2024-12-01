/**
indicar si dos números son iguales.
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Act1{
    public static void main(String args []){

    //Declaración de variables
    Scanner sc = new Scanner(System.in);
    int n1, n2;

    //Lectura de los números
    System.out.print("Introduce un número: ");
    n1 = sc.nextInt();
    System.out.print("Introduce otro número: ");
    n2 = sc.nextInt();

    //Determinar si los números son iguales.
    if (n1==n2){
        System.out.println(n1+ " y "+n2+" son el mismo número.");
    }else   System.out.println(n1+ " y "+n2+" son números diferentes.");

   }
}
