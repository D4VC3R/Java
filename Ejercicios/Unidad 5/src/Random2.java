import java.util.Scanner;

public class Random2 {
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
            }else if (num>secret){
                System.out.println("El número secreto es menor que el introducido, quedan "+intentos+" intentos.");
            }else if (num<secret){
                System.out.println("El número secreto es mayor que el introducido, quedan "+intentos+" intentos.");
            }else System.out.println("Vuelva a intentarlo.");

        }


    }
}
