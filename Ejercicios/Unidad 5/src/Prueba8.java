/**
Lectura de datos desde el teclado
@author David Cerdán*/

import java.util.Scanner;
public class Prueba8{
    public static void main(String[] args ){

    //Crear variable de lectura de teclado.
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tu nota: ");

    double nota = sc.nextDouble();

    if (nota<0 || nota>10){
    System.out.println("Nota inválida.");
        }else if(nota <=4){
        System.out.println("Tienes un insuficiente.");
            }else if (nota <6){
            System.out.println("Tienes un suficiente.");
                }else if (nota <7){
                System.out.println("Tienes un bien.");
                    }else if (nota <9){
                    System.out.println("Tienes un notable.");
                        }else if (nota >=9){
                        System.out.println("Tienes un sobresaliente.");
                        }
    }
}
