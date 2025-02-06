package ejercicios.ej106;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListaNombres {

    private TreeSet<String> nombres;
    private Scanner sc;

    public ListaNombres() {
        this.nombres = new TreeSet<>();
        this.sc = new Scanner(System.in);
        String nombre="";
        while (!nombre.equals("fin")){
            nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin"))
                break;
            nombres.add(nombre);
        }
    }

    @Override
    public String toString() {
        return nombres+" ";
    }

}
