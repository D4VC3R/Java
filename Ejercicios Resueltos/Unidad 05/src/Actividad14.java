/*Dados dos números enteros positivos, realiza un programa que calcule el
módulo entre el más grande y el más pequeño sin utilizar el operador % que
incorpora Java para hacer esta operación*/
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {

		int n1, n2, cociente, resto;
		
	Scanner sc = new Scanner(System.in);
	
	do {
	System.out.print("Número 1: ");
	n1 = sc.nextInt();
	System.out.print("Número 2: ");
	n2 = sc.nextInt();
	if(n1<=n2)
		System.out.println("Error. Número 1 debe ser mayor que número 2");
	}while (n1<=n2);

	cociente = (n1/n2);
	resto = n1-(n2*cociente);
	System.out.println(resto);
	
	
	}

}
