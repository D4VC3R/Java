package test;

import java.util.Scanner;

public class VocaloNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Palabra: ");
		char letra = sc.next().charAt(0);
		char letralow = Character.toLowerCase(letra);
		
		
		switch(letralow) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(letra+ " es una vocal.");
			break;
			default: System.out.println(letra+ " no es una vocal.");
		
		
		}
		

	}

}
