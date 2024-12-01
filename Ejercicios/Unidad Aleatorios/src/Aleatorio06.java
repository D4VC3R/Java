/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuantas
oportunidades quedan y si el número introducido es menor o mayor que en número secreto.*/
import java.util.Scanner;
public class Aleatorio06 {
    public static void main(String[] args) {

        int secret, intentos, num;
        Scanner sc = new Scanner(System.in);

        secret = (int)(Math.random()*(100));

        for (intentos = 5; intentos >= 0; intentos--) {
            System.out.print("Adivina el número: ");
            num = sc.nextInt();
            if (num==secret) {
                System.out.println("Acertaste");
                break;
            }else if (num>secret)
                System.out.println("El número secreto es menor que el introducido, quedan "+intentos+" intentos.");
            else
                System.out.println("El número secreto es mayor que el introducido, quedan "+intentos+" intentos.");

        }
        System.out.println("Vuelva a intentarlo.");

    }
}
