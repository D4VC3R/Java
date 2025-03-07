/*Escribe un programa que lea números enteros positivos. El programa irá
leyendo los números hasta que se introduzca un número negativo. Sacará por
pantalla cual es el número mayor y el menor de todos los números introducidos
(sin contar el negativo).*/
import java.util.Scanner;
public class Actividad27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, alto=-1, bajo=Integer.MAX_VALUE;

        System.out.print("Numero: ");
        num1 = sc.nextInt();

        do{
            if (num1 > alto)
                alto = num1;
            if (num1 < bajo)
                bajo = num1;

            System.out.print("Numero: ");
            num1 = sc.nextInt();
        }while(num1>=0);

        System.out.println("Más alto: "+alto+" \nMás bajo: "+bajo);
    }
}
