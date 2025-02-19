package actividades.ej05;
import actividades.ej01.excepciones.NumeroNegativoException;

import java.util.Scanner;
public class Ej05 {
    public static void main(String[] args){ final int NUM = 5;
        int[] enteros = new int[NUM];
        int posicion = 0;
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int divisor = 0;

        while(cont < NUM){

            System.out.print("Introduce una posición del array:");
            posicion = Integer.parseInt(sc.nextLine());
            System.out.print("Introduce un divisor:");
            divisor = Integer.parseInt(sc.nextLine());
            enteros[posicion] = 5 / divisor;
            cont++;
        }

        System.out.println("El contenido del array de enteros es:");
        for(int valor : enteros){
            System.out.println(valor);
        }
    }
}