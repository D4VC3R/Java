package ejercicios.ej09.prueba;

import ejercicios.ej09.codificador.Codificador;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String archivoLectura, archivoEscritura, texto, textoCifrado, rutaCodec;
        archivoLectura = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "ejercicios" + File.separator + "ej09" + File.separator + "archivos" + File.separator + "texto.txt";
        archivoEscritura = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "ejercicios" + File.separator + "ej09" + File.separator + "archivos" + File.separator + "textoCifrado.txt";
        rutaCodec = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "ejercicios" + File.separator + "ej09" + File.separator + "archivos" + File.separator + "codec.txt";


        /*Codificador c = new Codificador();

        texto = leerArchivo(archivoLectura);
        textoCifrado = c.cifrar(texto);
        grabarArchivo(archivoEscritura,textoCifrado);
        guardarCifrado(rutaCodec, c.getCifrado());*/

        Codificador c2 = new Codificador(cargarCifrado(rutaCodec));
        System.out.println(c2.descifrar(archivoEscritura, c2.getCifrado()));

    }

    public static String leerArchivo(String rutaArchivoLectura){
        String aux;
        String linea = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(rutaArchivoLectura));
            aux = in.readLine();
            while (aux != null) {
                linea += aux + "\n";
                aux = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        return linea;
    }

    public static void grabarArchivo(String archivoEscritura, String textoCifrado) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(archivoEscritura))) {
            out.write(textoCifrado);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarCifrado(String rutaCodec, HashMap<Character, Character> cifrado) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(rutaCodec))) {
            for (Map.Entry<Character, Character> entry : cifrado.entrySet()) {
                out.write(entry.getKey() + " -> " + entry.getValue());
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static HashMap<Character,Character> cargarCifrado(String rutaCodec) {
        HashMap<Character, Character> cifrado = new HashMap<>();
        try (BufferedReader in = new BufferedReader(new FileReader(rutaCodec))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                String[] partes = linea.split(" -> ");
                if (partes.length == 2) {
                    char clave = partes[0].charAt(0);
                    char valor = partes[1].charAt(0);
                    cifrado.put(clave, valor);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return cifrado;
    }
}
