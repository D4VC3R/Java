/*Realizar un programa en el cual el usuario introduzca una cantidad en euros
(con decimales) y obtengamos los billetes y monedas de euros
correspondientes, así como las monedas de céntimos correspondientes*/
import java.util.Scanner;
public class Actividad25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitamos la cantidad en euros
        System.out.print("Introduce una cantidad en euros (con decimales): ");
        double cantidad = scanner.nextDouble();

        // Separar la cantidad en la parte entera (euros) y la parte decimal (céntimos)
        int euros = (int) cantidad; // Parte entera en euros
        int centimos = (int) Math.round((cantidad - euros) * 100); // Parte decimal en céntimos

        // Desglosar en billetes
        int billetes500 = euros / 500;
        euros %= 500;

        int billetes200 = euros / 200;
        euros %= 200;

        int billetes100 = euros / 100;
        euros %= 100;

        int billetes50 = euros / 50;
        euros %= 50;

        int billetes20 = euros / 20;
        euros %= 20;

        int billetes10 = euros / 10;
        euros %= 10;

        int billetes5 = euros / 5;
        euros %= 5;

        // Desglosar en monedas de 1 y 2 euros
        int monedas2 = euros / 2;
        euros %= 2;

        int monedas1 = euros;

        // Desglosar en monedas de céntimos
        int monedas50c = centimos / 50;
        centimos %= 50;

        int monedas20c = centimos / 20;
        centimos %= 20;

        int monedas10c = centimos / 10;
        centimos %= 10;

        int monedas5c = centimos / 5;
        centimos %= 5;

        int monedas2c = centimos / 2;
        centimos %= 2;

        int monedas1c = centimos;

        // Mostrar el desglose
        System.out.println("Desglose en billetes y monedas:");
        if (billetes500 > 0) System.out.println("Billetes de 500€: " + billetes500);
        if (billetes200 > 0) System.out.println("Billetes de 200€: " + billetes200);
        if (billetes100 > 0) System.out.println("Billetes de 100€: " + billetes100);
        if (billetes50 > 0) System.out.println("Billetes de 50€: " + billetes50);
        if (billetes20 > 0) System.out.println("Billetes de 20€: " + billetes20);
        if (billetes10 > 0) System.out.println("Billetes de 10€: " + billetes10);
        if (billetes5 > 0) System.out.println("Billetes de 5€: " + billetes5);
        if (monedas2 > 0) System.out.println("Monedas de 2€: " + monedas2);
        if (monedas1 > 0) System.out.println("Monedas de 1€: " + monedas1);
        if (monedas50c > 0) System.out.println("Monedas de 50c: " + monedas50c);
        if (monedas20c > 0) System.out.println("Monedas de 20c: " + monedas20c);
        if (monedas10c > 0) System.out.println("Monedas de 10c: " + monedas10c);
        if (monedas5c > 0) System.out.println("Monedas de 5c: " + monedas5c);
        if (monedas2c > 0) System.out.println("Monedas de 2c: " + monedas2c);
        if (monedas1c > 0) System.out.println("Monedas de 1c: " + monedas1c);

    }
}