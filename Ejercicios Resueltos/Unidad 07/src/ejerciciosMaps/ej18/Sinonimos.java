package ejerciciosMaps.ej18;

import java.util.*;

public class Sinonimos {

    //Atributos
    Map<String, String> diccionario;

    //Constructor
    public Sinonimos() {
        this.diccionario = new HashMap<>();
        diccionario.put("caliente","hot");
        diccionario.put("rojo","red");
        diccionario.put("ardiente","hot");
        diccionario.put("verde","green");
        diccionario.put("agujetas","stiff");
        diccionario.put("abrasador","hot");
        diccionario.put("hierro","iron");
        diccionario.put("grande","big");
    }

    //metodos
    public void imprimirPantalla(String s){
        System.out.println(s);
    }

    public String getPalabra(){
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduzca la palabra y le daré los sinonimos: ");
        return sc.nextLine();
    }

    public Set getSinonimos(String palabra){
       Set<String> sinonimos = new HashSet<>();
       Set<Map.Entry<String, String>> vista = diccionario.entrySet();

       if (diccionario.containsKey(palabra)){
           for (Iterator<Map.Entry<String,String>> it = vista.iterator(); it.hasNext();){
               Map.Entry<String, String> m = it.next();
               if (m.getValue().equals(diccionario.get(palabra))){
                   sinonimos.add(m.getKey());
               } else if () {
                   
               }
           }
       }else {
           addPalabra(palabra)
       }
          return sinonimos; 
    }

    private void addPalabra(String palabra) {
        
    }

}
