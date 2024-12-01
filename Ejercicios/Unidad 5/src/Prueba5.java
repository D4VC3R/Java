/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba5{
    public static void main(String args []){

    //Crear variable de lectura de teclado.
    Scanner sc = new Scanner(System.in);

    //Pedir y leer datos
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();

    //Comprobar si el número es par.
    String mensaje = (n%2==0)?" es un número par.":" es un número impar.";
    System.out.println(n + mensaje);
    }
}
