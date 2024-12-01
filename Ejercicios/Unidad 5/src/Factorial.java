/**/
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont, factor;
		
		System.out.print("Número: ");
		int n = sc.nextInt();
		
		factor=1;
		
		for (cont=n;cont>=1;cont--){
			factor = cont*factor;
		}
		System.out.print("Factorial: "+factor);
	}
}
