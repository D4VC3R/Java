/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
import java.lang.Math;
public class Act14{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el número de niños: ");

    double chicos = sc.nextInt();

    System.out.print("Introduce el número de niñas: ");

    double chicas = sc.nextInt();

    double total = chicos + chicas;

    double pChicos = (chicos*100)/total;
    double pChicas = 100-pChicos;

    System.out.printf("Hay un %1.2f%% de niños y un  %2.2f%% de niñas.\n", pChicos,pChicas);


    }
}
