package test;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		//Definición de variables
		Scanner sc = new Scanner (System.in);
		int num, cont, producto;
		
		
		//Solicitud y lectura de datos
		System.out.print("Introduce un número: ");
		num = sc.nextInt(); 
		sc.close();
		
		//Creación de la tabla de multiplicar		
		producto=1;
		for (cont=1;cont<=10;cont++){
			producto = num*cont;
			System.out.println(num+"*"+cont+" = "+producto);
	
		}
	}
}
