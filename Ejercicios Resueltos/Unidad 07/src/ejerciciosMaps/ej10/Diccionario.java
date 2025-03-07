package ejerciciosMaps.ej10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {

    //Atributo
    private Map<String, String> diccionario;

    //Constructor
    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    //metodos

    public String getTraduccion(String palabra){
         return primeraMayuscula(getDiccionario().get(palabra));
    }

    public void addTraduccion(String esp, String ing){
        getDiccionario().put(esp.toLowerCase(), ing);
    }

    public String getPalabra(){
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Palabra: ");
        return sc.nextLine().toLowerCase();
    }
    private String primeraMayuscula(String palabra){
        if (palabra == null || palabra.isEmpty()){
            return palabra;
        }
        return palabra.substring(0,1).toUpperCase()+palabra.substring(1).toLowerCase();
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }
    public Map<String, String> getDiccionario() {
        return diccionario;
    }
}
