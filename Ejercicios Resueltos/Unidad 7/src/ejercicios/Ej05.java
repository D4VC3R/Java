/* Introducir por teclado, hasta que se introduzca ‘’fin’’, una serie de nombres que se insertarán
 en una colección, de forma que se conserve el orden de inserción y que no puedan repetirse.
 Mostrar la lista por pantalla*/
package ejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        LinkedHashSet<String> nombres = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String nombre = sc.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(nombre);
        }
        sc.close();
        System.out.println(nombres);
    }
}
