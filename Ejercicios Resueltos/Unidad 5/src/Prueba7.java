/**
Lectura de datos desde el teclado
@author David Cerdán*/
import java.util.Scanner;
import java.lang.Math;
public class Prueba7{
    public static void main(String args []){

    //Crear variable de lectura de teclado.
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce hora del dia: ");

    int hora = sc.nextInt();

    if (hora>=06 && hora<=12){
        System.out.println("Buenos días.");
        }else if (hora>=13 && hora<=20){
            System.out.println("Buenas tardes.");
            }else if ((hora>=21 && hora<=23) || (hora>=00 && hora<=05)){
                System.out.println("Buenas noches.");
                }else{
                    System.out.println("Hora no válida.");
                    }
    }
}
