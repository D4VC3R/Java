/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
import java.lang.Math;
public class Act2{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);
    double euros;

    System.out.print("Euros: ");

    euros = sc.nextDouble();

    System.out.println("Pesetas: "+ Math.round(euros*166.386));

    }
}
