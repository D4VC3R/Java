/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
import java.lang.Math;
public class Act18{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce distancia del cateto: ");

    double cat1 = sc.nextDouble();

    System.out.print("Introduce distancia del otro cateto: ");

    double cat2 = sc.nextDouble();

    double hipo = Math.sqrt((cat1*cat1)+(cat2*cat2));

    System.out.printf("La hipotenusa es: %.2f\n" ,hipo);

   }
}
