package ejercicios6A.ej02;

import ejercicios6A.ej01.Ej01;

import java.io.*;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {

        Ej02 programa = new Ej02();
        programa.inicio();
    }

    private void inicio() {
        double num=0;

        try {
            num = leerDouble();
            System.out.println(num);
        } catch (IOException e) {
            System.out.println("Archivo no encontrado.");        }
    }

    private double leerDouble() throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"archivos"+File.separator+"Binario.dat"));
        double num;

        num = in.readDouble();
        in.close();
        return num;
    }
}
