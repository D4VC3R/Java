package ejercicios.ej06;

import ejercicios.ej06.persona.Persona;

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ej06 {
    public static void main(String[] args) {

        Set<Persona> libroFirmas = new TreeSet<>();
        String rutaArchivo = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "ejercicios" + File.separator + "ej06" + File.separator + "archivos" + File.separator + "firmas.txt";
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion;

        cargarFirmas(libroFirmas, rutaArchivo);

        do {
            menu();
            try {
                opcion = Integer.parseInt(sc.next());
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nombre de la persona:");
                        Persona persona = new Persona(sc.next());
                        if (addFirma(libroFirmas, persona))
                            System.out.println("Firma añadida.");
                         else
                            System.out.println("La firma ya existe.");
                        break;
                    case 2:
                        mostrarFirmas(libroFirmas);
                        break;
                    case 3:
                        guardarFirmas(libroFirmas, rutaArchivo);
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        }while (continuar);
    }


    public static boolean addFirma(Set<Persona> libroFirmas, Persona persona) {
        return libroFirmas.add(persona);
    }

    public static void menu() {
        System.out.println("1. Añadir firma");
        System.out.println("2. Mostrar firmas");
        System.out.println("3. Guardar y salir");
    }

    public static void mostrarFirmas(Set<Persona> libroFirmas) {
        if (!libroFirmas.isEmpty()) {
            System.out.println("Lista de firmas:");
            for (Persona persona : libroFirmas) {
                System.out.println(persona);
            }
        }else
            System.out.println("No hay firmas en el libro.");
    }

    public static void guardarFirmas(Set<Persona> libroFirmas, String rutaArchivo) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(rutaArchivo,true));
            for (Persona persona : libroFirmas) {
                out.write(persona.getNombre());
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void cargarFirmas(Set<Persona> libroFirmas, String rutaArchivo) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = in.readLine()) != null) {
                libroFirmas.add(new Persona(linea));
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
