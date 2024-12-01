/*Haz un programa que lea desde el teclado un valor de tipo entero. A
continuación, tiene que dibujar una pirámide hecha de asteriscos (‘*’) de una
altura igual al valor leído.*/
import java.util.Scanner;
public class Actividad24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, filas, blancos, asteriscos;

		
		System.out.print("Filas: ");
		filas = sc.nextInt();
		
		for (i=1; i<=filas; i++){
			
			for(blancos=1;blancos<=filas-i;blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(asteriscos=1; asteriscos<=(i*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
		}
	}

}
