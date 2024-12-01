/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
import java.lang.Math;
public class Act19{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);
    int cont;
    double total=0;

    System.out.print("Introduce importe de la factura: ");

    double fact = sc.nextDouble();

    System.out.print("Introduce los años a calcular: ");

    int anos = sc.nextInt();

    for (cont=1;cont<=anos;cont++){
    total = fact*0.03;

    }

    System.out.println("Dentro de " +anos+ " años pagarás "+(total+fact)+"€.");

   }
}
