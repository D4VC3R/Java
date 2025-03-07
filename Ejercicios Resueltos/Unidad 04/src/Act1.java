/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
public class Act1{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);
    double n1, n2;

    System.out.print("Escribe dos números: ");

    n1 = sc.nextDouble();
    n2 = sc.nextDouble();

    System.out.println("Resultado: "+(n1*n2));

    }
}
