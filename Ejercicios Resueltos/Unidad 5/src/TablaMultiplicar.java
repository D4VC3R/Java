package test;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		//Definici�n de variables
		Scanner sc = new Scanner (System.in);
		int num, cont, producto;
		
		
		//Solicitud y lectura de datos
		System.out.print("Introduce un n�mero: ");
		num = sc.nextInt(); 
		sc.close();
		
		//Creaci�n de la tabla de multiplicar		
		producto=1;
		for (cont=1;cont<=10;cont++){
			producto = num*cont;
			System.out.println(num+"*"+cont+" = "+producto);
	
		}
	}
}
