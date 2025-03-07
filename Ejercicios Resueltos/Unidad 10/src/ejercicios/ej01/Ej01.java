package ejercicios.ej01;

import java.io.*;
import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {

        Ej01 programa = new Ej01();
        programa.inicio();

    }

    private void inicio() {
        String fichero;

        System.out.print("Fichero: ");
        fichero = getFichero();
        System.out.print(getContenidoFichero(fichero));


    }

    private String getFichero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    private String getContenidoFichero(String fichero){
        String directorioRaiz, rutaArchivo, linea, texto="";
        directorioRaiz = System.getProperty("user.dir");

        if (fichero!=null){
            rutaArchivo = directorioRaiz + File.separator + "src" + File.separator + "archivos" + File.separator + fichero;
        }else
            rutaArchivo = directorioRaiz + File.separator + "src" + File.separator + "archivos" + File.separator + "prueba.txt";
        try{
            BufferedReader in = new BufferedReader(new FileReader(rutaArchivo));

            do {
                linea = in.readLine();
                texto += linea;
            }while(linea!=null);

        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return texto;
    }
}
