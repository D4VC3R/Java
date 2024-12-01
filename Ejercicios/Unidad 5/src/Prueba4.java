/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba4{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int n = sc.nextInt();

    if (n%2==0){
        System.out.println(n+" es un número par.");
    }else{
        System.out.println(n+ " es un número impar");
        }
   }
}
