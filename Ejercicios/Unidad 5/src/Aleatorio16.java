import java.util.Locale;
import java.util.Scanner;

public class Aleatorio16 {
    public static void main(String[] args) {

        int selecFigura1, monedas = 100, apuesta;
        String figuraActual = "", figura1 = "", figura2 = "", figura3 = "", continuar;
        Scanner sc = new Scanner(System.in);


        while (monedas > 0) {
            System.out.print("Monedas: " + monedas + " || ");
            System.out.print("Introduce tu apuesta: ");
            apuesta = sc.nextInt();

            if (apuesta > monedas) {
                System.out.println("No puedes apostar mas de lo que tienes.");
            } else if (apuesta <= 0)
                System.out.println("Introduzca una apuesta válida.");
            else {
                monedas -= apuesta;

                for (int j = 1; j <= 3; j++) {

                    selecFigura1 = (int) (Math.random() * 5 + 1);

                    switch (selecFigura1) {
                        case 1 -> figuraActual = "corazón";
                        case 2 -> figuraActual = "diamante";
                        case 3 -> figuraActual = "herradura";
                        case 4 -> figuraActual = "campana";
                        case 5 -> figuraActual = "limón";
                    }

                    if (j == 1)
                        figura1 = figuraActual;
                    else if (j == 2)
                        figura2 = figuraActual;
                    else
                        figura3 = figuraActual;

                    System.out.print(figuraActual + " ");
                }
                System.out.println();

                if (figura1.equals(figura2) && figura1.equals(figura3)) {
                    monedas += apuesta+(apuesta * 10);
                    System.out.println("Premio gordo. Monedas actuales: " + monedas);
                } else if (figura1.equals(figura2) || figura2.equals(figura3) || figura3.equals(figura1)) {
                    monedas += apuesta;
                    System.out.println("Ha recuperado sus monedas. Monedas actuales: " + monedas);
                } else
                    System.out.println("Lo siento, ha perdido. Monedas actuales: " + monedas);
            }
            if(monedas <= 0)
                System.out.println("Ha perdido todo su dinero.");
            else {
                System.out.println("¿Quieres seguir jugando(s/n)?: ");
                continuar = sc.next().toLowerCase(Locale.ROOT);
                if (continuar.equals("n")) {
                    System.out.println("Te retiras con " + monedas + " monedas.");
                    monedas = 0;
                } else
                    System.out.println();
            }
        }
        
    }
}
