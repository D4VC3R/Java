/*Haz un programa que lea las coordenadas de un punto y nos diga a qué
		cuadrante pertenece.*/
import java.util.Scanner;
public class Actividad07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		do {
		System.out.print("Posicion X: ");
		x = sc.nextInt();
		System.out.print("Posicion Y: ");
		y = sc.nextInt();
		
		if(x==0 || y==0)
			System.out.println("X e Y deben ser distintos de 0.");
		
		}while(x==0 || y==0);
		
		if(x>0 && y>0) {
			System.out.println("Cuadrante 1.");
		}else if (x<0 && y>0) {
			System.out.print("Cuadrante 2.");
		}else if (x<0 && y<0) {
			System.out.print("Cuadrante 3.");
		}else if (x>0 && y<0) {
			System.out.print("Cuadrante 4.");
		}
		

	}

}
