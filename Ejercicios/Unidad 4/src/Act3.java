/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
import java.lang.Math;
public class Act3{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);
    int ptas;

    System.out.print("Pesetas: ");

    ptas = sc.nextInt();

    System.out.printf("Euros: %.2f%n",(ptas/166.386));

    }
}
