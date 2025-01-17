/* Haz un programa que le pida al usuario su nombre y muestre sus letras
 separadas por guiones. Por ejemplo, si el usuario se llama Joan, deberá de
 mostrar J-o-a-n */
import java.util.Scanner;
public class Strings2 {
    public static void main(String[] args) {

        Strings2 programa = new Strings2();
        programa.inicio();
    }

    private void inicio() {
        
        String nombre, nombreGuiones;
        
        nombre = pedirNombre();
        nombreGuiones = dividirNombre(nombre);
        imprimirResultado (nombreGuiones);

    }

    private void imprimirResultado(String nombreGuiones) {
        imprimirPantalla(nombreGuiones);
    }

    private String dividirNombre(String nombre) {
        String resultado = "";
        for (int i = 0; i < nombre.length(); i++) {
            if (i==nombre.length()-1) {
                resultado += nombre.charAt(i);
            }else
                resultado += nombre.charAt(i)+"-";
            
        }
        return resultado;
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
