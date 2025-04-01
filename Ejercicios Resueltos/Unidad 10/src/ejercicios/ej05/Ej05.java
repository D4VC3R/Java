package ejercicios.ej05;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ej05 {
    public static void main(String[] args) {

        String rutaArchivo = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "ejercicios" + File.separator + "ej05" + File.separator + "archivos" + File.separator + "numeros.txt";
        ArrayList<Integer> numeros = new ArrayList<>();

        try {
            numeros = leerDocumento(rutaArchivo);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        }

        numeros.sort(Comparator.naturalOrder());
        System.out.println(numeros);

    }

    private static ArrayList<Integer> leerDocumento(String rutaArchivo) throws FileNotFoundException {
        String linea;
        ArrayList<Integer> aux = new ArrayList<Integer>();

        try{
                BufferedReader in = new BufferedReader(new FileReader(rutaArchivo));
                linea = in.readLine();
                while (linea != null){
                    aux.add(Integer.parseInt(linea));
                    linea = in.readLine();
                }
                in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        return aux;
    }
}
