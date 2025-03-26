package json.myjson;

import com.google.gson.Gson;

import java.io.*;

public class MyJSON {

    //Convertir cualquier objeto (Clase, Set, Collection, etc.) a archivo JSON
    public static String objetoToJSON(Object o){
        Gson g = new Gson();
        return g.toJson(o);
    }

    //Convertir cualquier JSON a objeto
    public static Object jsonToObject(String json, Class clase){

        Gson g = new Gson();
        Object o = g.fromJson(json,clase);
        return clase.cast(o);
    }

    //Grabar la informacion que se encuentra en memoria ram a archivo json
    public static void grabarJSON(String json, String rutaArchivo) {

        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(rutaArchivo));
            out.write(json);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Leer archivo json y guardarlo en un String para convertirlo a objeto.
    public static String leerJSON(String rutaArchivo){
        String cad = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(rutaArchivo));
            cad = in.readLine();
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cad;
    }
}
