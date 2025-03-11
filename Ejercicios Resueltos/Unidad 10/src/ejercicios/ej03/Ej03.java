package ejercicios.ej03;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ej03 {
    public static void main(String[] args) {

        String nombreArchivo = "numeros.dat";
        String rutaArchivo = System.getProperty("user.dir") + File.separator + "src" + File.separator + "archivos" + File.separator + nombreArchivo;

        guardarNumeros(rutaArchivo);
        mostrarNumeros(rutaArchivo);

    }

    private static void mostrarNumeros(String rutaArchivo) {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            int num;

            System.out.print("Números en el archivo:\n| ");

            do {
                num = in.readInt();
                System.out.print(num+" | ");
            }while(in.available()>0);

        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }

    private static void guardarNumeros(String rutaArchivo) {

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            int num;

            do {
            num = getNumero();

            if (num<0)
                break;
            else
                out.writeInt(num);

            }while(true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Números guardados.");

    }

    private static int getNumero() {
        Scanner sc = new Scanner(System.in);
        int num =-1;
        boolean numValido = false;

        do {
            try {
                num = Integer.parseInt(sc.nextLine());
                numValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Solo números enteros positivos (negativo para terminar).");
            } catch (InputMismatchException e){
                System.out.println("No se admiten letras ni símbolos.");
            }
        }while(!numValido);

        return num;
    }
}
