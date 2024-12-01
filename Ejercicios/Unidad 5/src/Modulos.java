import java.util.Scanner;

public class Modulos {

	public static void main(String[] args) {

		int n1, n2, cociente, resto;
		
	Scanner sc = new Scanner(System.in);
	
	do {
	System.out.print("N�mero 1: ");
	n1 = sc.nextInt();
	System.out.print("N�mero 2: ");
	n2 = sc.nextInt();
	if(n1<=n2)
		System.out.println("Error. N�mero 1 debe ser mayor que n�mero 2");
	}while (n1<=n2);

	cociente = (n1/n2);
	resto = n1-(n2*cociente);
	System.out.println(resto);
	
	
	}

}
