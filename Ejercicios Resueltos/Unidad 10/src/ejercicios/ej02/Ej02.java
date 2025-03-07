package ejercicios.ej02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {

        Ej02 programa = new Ej02();
        programa.inicio();
    }

    private void inicio() {

        String nombre;
        int edad;
        String directorio = System.getProperty("user.dir")+File.separator+"src"+File.separator+"archivos"+File.separator+"Datos.txt";

        System.out.print("Nombre: ");
        nombre = getNombre();
        edad = getEdad();

        escribirArchivo(directorio, nombre, edad);
    }

    private void escribirArchivo(String directorio, String nombre, int edad) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(directorio));
            out.write("Nombre: "+nombre+"\nEdad: "+edad);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    private int getEdad() {
        Scanner sc = new Scanner(System.in);
        int edad=0;
        boolean edadValida = false;
        do {
            try{
                System.out.print("Edad: ");
                edad = Integer.parseInt(sc.nextLine().trim());
                if (edad >0 && edad <120) {
                    edadValida = true;
                }else
                    System.out.println("Edad no válida.");
            }catch (NumberFormatException e){
                System.out.print("Introduce un número\n");
            }
        }while(!edadValida);

        return edad;
    }

    private String getNombre() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
