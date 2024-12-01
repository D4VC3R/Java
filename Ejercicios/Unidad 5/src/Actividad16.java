/*Realiza un programa que lea números por teclado y deje de leerlos cuando se
introduzca un 0. El programa tendrá que mostrar la cantidad de números
positivos y negativos introducidos por el usuario*/
import java.util.Scanner;
public class Actividad16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positivos=0, negativos=0,num;


        do {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
        } while (num != 0);

        System.out.println("Positivos: " + positivos + "\nNegativos: " + negativos);

    }
}
