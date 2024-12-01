import java.util.Scanner;

public class E2E1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, sumaDivisores;
        char pregunta;
        boolean continuar=true;

        //Bucle que se rompe cuando el usuario introduce una n
        do {
            System.out.println("\nNÚMERO PERFECTE\n---------------");
            System.out.print("Número: ");
            n = sc.nextInt();

            //Obtención y suma de divisores (exceptuando al número introducido).
            sumaDivisores = 0;

            for (i=1;i<n;i++){
            if(n%i==0)
                sumaDivisores += i;
            }

            //Comprobamos si la suma de los divisores es igual al número introducido.
            if (sumaDivisores==n)
                System.out.println("El número "+n+" es perfecto.");
            else
                System.out.println("El número "+n+" no es perfecto.");

            //Nos aseguramos de que el usuario introduce un valor válido a la pregunta.
            do {
                System.out.print("¿Quieres continuar (s/n)?: ");
                pregunta = sc.next().charAt(0);
                if (pregunta == 's')
                    continuar = true;
                else if (pregunta == 'n')
                    continuar = false;
                else
                    System.out.println("Respuesta inválida, elija s/n.");
            }while(pregunta!='n' && pregunta!='s');

            //Rompemos o continuamos el bucle según la respuesta del usuario.
        }while(continuar);
    }
}
