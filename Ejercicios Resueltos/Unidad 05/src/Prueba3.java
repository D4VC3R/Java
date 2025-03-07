/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba3{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce precio del televisor: ");

    double precio = sc.nextDouble();

    if (precio>999){
        double pFinal = precio*0.90;
        double desc = precio/10;
        System.out.println("Has pagado "+pFinal+"€ con un descuento de "+desc+"€.");
    }
    else System.out.println("Has pagado "+precio+"€.");
   }
}
