package test;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String dia,mes;
		int ano;
		
		System.out.print("Fecha: ");
		dia = sc.next();
		sc.next();
		mes = sc.next().toLowerCase();
		sc.next();
		ano = sc.nextInt();
		
		switch(dia) {
		case "1": dia="01";
		break;
		case "2": dia="02";
		break;
		case "3": dia="03";
		break;
		case "4": dia="04";
		break;
		case "5": dia="05";
		break;
		case "6": dia="06";
		break;
		case "7": dia="07";
		break;
		case "8": dia="08";
		break;
		case "9": dia="09";
		break;
		default: System.out.println("El dia no puede ser 0.");
		}
		
		switch(mes) {
		case "enero": mes="01";
		break;
		case "febrero": mes="02";
		break;
		case "marzo": mes="03";
		break;
		case "abril": mes="04";
		break;
		case "mayo": mes="05";
		break;
		case "junio": mes="06";
		break;
		case "julio": mes="07";
		break;
		case "agosto": mes="08";
		break;
		case "septiembre": mes="09";
		break;
		case "octubre": mes="10";
		break;
		case "noviembre": mes="11";
		break;
		case "diciembre": mes="12";
		break;
		default: System.out.println("Mes inventado, inserta uno real.");
		}
		
		
		System.out.println(dia + "/" +mes+ "/" +(ano%100));
		
	}

}
