package ejercicios6A.ej01;

import java.io.*;
import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {

        Ej01 programa = new Ej01();
        programa.inicio();
    }

    private void inicio() {
        double num;

        num = getNumeroValido();

        try {
            grabarDouble(num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void grabarDouble(double num) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"archivos"+File.separator+"Binario.dat"));
        out.writeDouble(num);
        out.close();
    }

    private double getNumeroValido() {
        Scanner sc = new Scanner(System.in);
        double num=0.0;
        boolean datoValido=false;

        do {
            try {
                System.out.print("Decimal: ");
                num = Double.parseDouble(sc.nextLine());
                datoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número decimal.");
            }
        }while(!datoValido);

        return num;
    }
}
