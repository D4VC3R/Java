/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba66{
    public static void main(String args []){

    //Crear variable de lectura de teclado.
    Scanner sc = new Scanner(System.in);
    int n;
    final int secret = 43;

    System.out.print("Adivina el número: ");

    n = sc.nextInt();

        if(n==secret){
            System.out.println("¡Número correcto!");
        }else System.out.println("Número erróneo.");
    }
}
