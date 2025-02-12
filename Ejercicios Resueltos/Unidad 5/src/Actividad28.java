/*Haz un programa que lea dos números enteros positivos, tal que el primero
tiene que ser menor que el segundo. Visualiza por pantalla la suma de los
números pares que hay entre estos números, sin contar con los números leídos*/
import java.util.Scanner;
public class Actividad28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        do {
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número: ");
            num2 = scanner.nextInt();

            if (num1 >= num2 || num1 <= 0) {
                System.out.println("Error: asegúrate de que el primer número es positivo y menor que el segundo.");
            }
        } while (num1 >= num2 || num1 <= 0);

        int sumaPares = 0;

        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + sumaPares);

    }
}
