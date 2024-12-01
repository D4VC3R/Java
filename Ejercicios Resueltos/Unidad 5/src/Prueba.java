/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba{
    public static void main(String args []){

    int a, b, c;
    Scanner sc = new Scanner(System.in);

    System.out.print("A: \nB: ");
    a = sc.nextInt();
    b = sc.nextInt();

    //c es una variable auxiliar donde guardamos el contenido de b para no perderlo.
    c = b;
    b = a;
    a = c;

    System.out.println("A: "+a+"\nB: "+b);

   }
}
