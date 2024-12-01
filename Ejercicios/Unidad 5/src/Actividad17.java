/*Haz un programa que lea desde el teclado dos valores enteros n1 y n2,
compruebe que n1 < n2 (y muestre un error si no es así), y finalmente escriba
todos los números enteros que hay dentro del intervalo [n1, n2] en orden
creciente y en orden decreciente.*/
import java.util.Scanner;
public class Actividad17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, cont1, cont2;

        do {
            System.out.print("Número 1: ");
            n1 = sc.nextInt();
            System.out.print("Número 2: ");
            n2 = sc.nextInt();
            if (n1 >= n2)
                System.out.println("Error.");
            }while(n1>n2);

        System.out.println("Cadena ascendente:");
        for (cont1=n1;cont1<=n2;cont1++) {
            System.out.print(cont1+ " ");
                }
        System.out.println("\nCadena descendente:");
        for (cont2=n2;cont2>=n1;cont2--){
            System.out.print(cont2+ " ");
        }

    }
}
