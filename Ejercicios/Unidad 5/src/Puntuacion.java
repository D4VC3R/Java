package test;
import java.util.Scanner;

public class Puntuacion {

	public static void main(String[] args) {
		
		int puntuacion;
		double pTotal;
		Scanner sc = new Scanner(System.in);
		pTotal = 1;
		
		
		   do { 
	            System.out.print("Introduce puntuaci�n: ");
	            puntuacion = sc.nextInt();
	            
	            if (puntuacion != 0) {
	                if (puntuacion <= 3000 && puntuacion >= 2000) {
	                    pTotal += puntuacion * 0.3;
	                } else {
	                    pTotal += puntuacion * 0.2;
	                }
	            }
	            
	        } while (puntuacion != 0);

	        System.out.println("Puntuaci�n total: " + pTotal);
	    }

	}