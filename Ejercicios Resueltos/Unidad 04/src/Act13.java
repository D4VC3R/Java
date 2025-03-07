/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.*;
import java.lang.Math;
public class Act13{
    public static void main(String args []){

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la nota del primer examen: ");

    double nota1 = sc.nextDouble();

    System.out.print("Que nota quieres en el trimestre: ");

    double notaFinal = sc.nextDouble();

    double nota2 = (notaFinal - nota1*0.4)/0.6;

    System.out.println("Necesitas sacar un "+nota2+ " en el siguiente examen.");

    }
}
