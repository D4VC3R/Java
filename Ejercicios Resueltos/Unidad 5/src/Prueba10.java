/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba10{
    public static void main(String args []){

    int cont;
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce número: ");
    int num = sc.nextInt();

    for (cont=1;cont<=10;cont++){
        System.out.print(num+"*"+cont+" = "+num*cont+"\n");
    }
    }
}
