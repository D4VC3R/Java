package ejercicios6A.ej03;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {

        Ej03 programa = new Ej03();
        programa.inicio();
    }

    private void inicio() {

        ArrayList<Object> num = new ArrayList<>();
        String numero;

        do {
            System.out.print("Número: ");
            try{
                numero = getNumero();
                if (numero.matches("0")){
                    break;
                }else
                    grabarNumero(num);
            }catch (NumberFormatException | IOException e){
                System.out.println("Dato inválido.");
            }
        }while(true);

        try {
            mostrarNumeros();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }


    }

    private void mostrarNumeros() throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"archivos"+File.separator+"Numeros.dat"));
        try {
            in.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    private void grabarNumero(ArrayList num) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"archivos"+File.separator+"Numeros.dat"));
        out.writeObject(num);
        out.close();
    }

    private String getNumero()throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        String num;

        num = String.valueOf(Integer.parseInt(sc.nextLine()));
        return num;
    }
}
