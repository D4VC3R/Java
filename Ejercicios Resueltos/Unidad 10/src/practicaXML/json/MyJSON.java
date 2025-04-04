package practicaXML.json;

import com.google.gson.Gson;
import practicaXML.libreria.Libreria;

import java.io.*;

public class MyJSON {

    public static String objetoToJSON(Object o) {
        Gson g = new Gson();
        return g.toJson(o);
    }

    public static Object jsonToObjeto(String json, Class clase) {
        Gson g = new Gson();
        return clase.cast(g.fromJson(json, clase));
    }

    public static void guardarJSON(String json, String rutaArchivo){
        try (BufferedWriter out = new BufferedWriter(new FileWriter(rutaArchivo))) {
            out.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String leerJSON(String rutaArchivo) {
        String cad;
        try (BufferedReader in = new BufferedReader(new FileReader(rutaArchivo))) {
            cad = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cad;
    }
}
