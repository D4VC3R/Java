/*Haz un programa que lea un carácter por la entrada estándar y me diga si es una
vocal o no.*/
import java.util.Scanner;
public class Actividad05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char letra;

        System.out.print("Introduce una letra: ");
        letra = sc.next().charAt(0);

        switch(letra){
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println(letra +" es una vocal.");
                break;
            default:
                System.out.println(letra +" no es una vocal.");
        }

    }
}