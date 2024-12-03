/*Escribe una programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas la ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.*/
import java.util.Scanner;
public class Actividad07 {
    public static void main(String[] args) {
        Actividad07 programa = new Actividad07();
        programa.inicio();

    }

    private void inicio() {
        int[] array = new int[100];
        int valor1,valor2;

        asignNumArray(array);
        printArray(array);

        valor1=getValor("Valor 1: ");
        valor2=getValor("Valor 2: ");

        sustValor(array,valor1,valor2);
    }

    private void sustValor(int[] array, int valor1, int valor2) {
        for (int i=0;i< array.length;i++){
            if (array[i]==valor1)
                imprimirPantalla("\""+valor2+"\" | ");
            else
                imprimirPantalla(array[i]+ " | ");
        }
    }

    private int getValor(String s) {
        Scanner sc=new Scanner(System.in);

        System.out.print(s);
        return sc.nextInt();
    }

    private void printArray(int[] num) {
        String resultado;
        
        resultado=getResultado(num);
        System.out.println(resultado);
    }

    private String getResultado(int[] num) {
        String resultado="";
        
        for (int i = 0; i < num.length; i++){
            resultado+=num[i] + " | ";
        }
        return resultado;
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private void asignNumArray(int[] num) {
        for (int i = 0; i < num.length; i++){
            num[i] = (int) (Math.random() * 21);
        }
    }
}