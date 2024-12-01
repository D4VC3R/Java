/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba2{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tu edad: ");

    int edad = sc.nextInt();

    if (edad<18){
        System.out.println("Eres menor de edad.");
    }
    else System.out.println("Eres mayor de edad.");
   }
}
