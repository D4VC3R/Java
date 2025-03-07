package ejerciciosMaps.ej15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capitales {

    //Atributos
    Map<String, String> ciudades;

    //Constructor
    public Capitales() {
        this.ciudades = new HashMap<>();
        ciudades.put("España","Madrid");
        ciudades.put("Portugal","Lisboa");
        ciudades.put("Francia","París");
    }

    //Metodos
    public String getPais(){
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Escribe el nombre de un pais y te diré su capital: ");
        return sc.nextLine();
    }

    public String getCapital(String pais){
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("No conozco la respuesta, ¿cual es la capital de " + pais + "?");
        return sc.nextLine();
    }

    private void imprimirPantalla(String s) {
        System.out.println(s);
    }

    public void mostrarCapital(){
        String pais;
        boolean seguir=true;

        do {
            pais = getPais();
            if (pais.equalsIgnoreCase("salir")){
                seguir = false;
            } else if (ciudades.containsKey(pais)){
                imprimirPantalla("La capital de " + pais + " es " + ciudades.get(pais));
            }else
                addCapital(pais,getCapital(pais));
        }while(seguir);
    }

    public void addCapital(String pais, String capital){
        ciudades.put(pais,capital);
    }
}
