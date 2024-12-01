/*Haz un programa que lea desde el teclado un valor entero y a continuación
muestro hasta qué punto de la secuencia ordenada de número positivos (1, 2, 3,
etc.) hay que sumar para llegar al número más próximo por debajo de este valor.
Finalmente, tienen que mostrar cuál es la suma de estos números. Por ejemplo,
si la entrada es el número 12, el resultado es mostrar los números 0, 1, 2, 3 y 4,
y su suma, que es 10, puesto que si se incluye el 5 nos pasamos de 12.*/
import java.util.Scanner;
public class Actividad21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int num1 = sc.nextInt();

        int suma=0, cont=0;

        System.out.print("Sucesión: ");

        while(suma<=num1){
            cont++;
            System.out.print(cont+" ");
            suma=suma+cont;
        }

        System.out.println("\nLa suma mas cercana es: "+(suma-cont));
    }
}
