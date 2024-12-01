import java.util.Scanner;
public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
