package ejercicios.ej04;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {

        String nombreArchivo = "numerosDouble.dat";
        String rutaArchivo = System.getProperty("user.dir") + File.separator + "src" + File.separator + "archivos" + File.separator + nombreArchivo;
        double[] numeros;

        imprimirPantalla("Cantidad de números a guardar: ");
        numeros = new double[getEntero()];
        imprimirPantalla("Introduce los "+numeros.length+" números que vas a guardar: ");
        llenarArray(numeros);
        guardarArray(numeros,rutaArchivo);
        leerArray(rutaArchivo);

    }

    private static void leerArray(String rutaArchivo) {
        imprimirPantalla("Números en el fichero:\n| ");
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            double[] numeros = (double[])in.readObject();

            for(double n : numeros) {
                System.out.print(n+" | ");
            }
            
        } catch (IOException | ClassNotFoundException e) {
            imprimirPantalla(e.getMessage());
        }
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static void guardarArray(double[] numeros, String rutaArchivo) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {

            out.writeObject(numeros);

        } catch (IOException e) {
            imprimirPantalla(e.getMessage());
        }
        imprimirPantalla("Números guardados.\n");

    }

    private static void llenarArray(double[] numeros) {

            for (int i = 0; i < numeros.length; i++) {
                numeros[i]=getDouble();
            }
    }

    private static double getDouble() {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        boolean numValido = false;

        do {
            try {
                num = Double.parseDouble(sc.nextLine());
                numValido = true;
            } catch (NumberFormatException e) {
                imprimirPantalla("Solo números decimales.\n");
            } catch (InputMismatchException e){
                imprimirPantalla("No se admiten letras ni símbolos.\n");
            }
        }while(!numValido);

        return num;
    }
        private static int getEntero() {
            Scanner sc = new Scanner(System.in);
            int num =-1;
            boolean numValido = false;

            do {
                try {
                    num = Integer.parseInt(sc.nextLine());
                    if (num>0)
                        numValido = true;
                } catch (NumberFormatException e) {
                    imprimirPantalla("Solo números enteros positivos.\n");
                } catch (InputMismatchException e){
                    imprimirPantalla("No se admiten letras ni símbolos.\n");
                }
            }while(!numValido);

            return num;
        }

}
