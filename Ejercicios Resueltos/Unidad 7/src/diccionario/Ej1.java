package diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        String cad = getFrase();
        Map<Character,Integer> frecuencia = new HashMap<>();

    }

    public static String getFrase(){
        Scanner sc = new Scanner(System.in);

        imprimirPantalla("Frase: ");
        return sc.nextLine();
    }

    public static void imprimirPantalla(String s){
        System.out.println(s);
    }
    Map<Character,Integer> cuentaLetras = new HashMap<>();

}
