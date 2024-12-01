/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
import java.lang.Math;
public class Act12{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);
    int edad;

    System.out.print("Introduce nombre y edad: ");
    sc.next();
    edad = sc.nextInt();


    System.out.println("Tienes "+(2024-edad)+" años.");

    }
}
