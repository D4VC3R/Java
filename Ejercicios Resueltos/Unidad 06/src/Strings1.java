/*  1. Haz un programa que le pida al usuario su nombre y le diga cuál es su inicial. */
import java.util.Scanner;
public class Strings1 {
    public static void main(String[] args) {
        
        Strings1 programa = new Strings1();
        programa.inicio();
    }

    private void inicio() {

        String nombre;
        char inicial;

        nombre=pedirNombre();
        inicial=getInicial(nombre);
        imprimirResultado(nombre, inicial);
    }

    private void imprimirResultado(String nombre, char inicial) {
        imprimirPantalla("La primera letra de "+nombre+" es "+inicial+".");
    }

    private char getInicial(String nombre) {
        return nombre.charAt(0);
    }


    private String pedirNombre() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Nombre: ");
        return sc.nextLine();
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }
}
