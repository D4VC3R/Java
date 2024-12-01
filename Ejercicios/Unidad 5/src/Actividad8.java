/*Haz un programa que dados dos números enteros, nos diga el signo que tendrá
el producto. No hay que calcular el resultado, tan solo hay que decir el signo.*/
import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2, producto;
		
		System.out.print("Número: ");
		n1 = sc.nextInt();
		System.out.print("Número: ");
		n2 = sc.nextInt();
		
		producto = n1*n2;
		
		if(producto>0) {
			System.out.println("El producto de " +n1+ " multiplicado por " +n2+ " es de signo positivo.");
		}else if(producto<0) {
			System.out.println("El producto de " +n1+ " multiplicado por "+n2+ " es de signo negativo.");
		}else 
			System.out.println("El producto de " +n1+ " multiplicado por "+n2+ " no es positivo ni negativo, es cero.");
	}
}
