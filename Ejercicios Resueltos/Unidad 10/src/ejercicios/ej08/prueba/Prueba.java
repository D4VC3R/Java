package ejercicios.ej08.prueba;

import ejercicios.ej08.persona.Persona;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Prueba {
    public static void main(String[] args) {

        String directorio;
        String archivoTodos, archivoPerso1, archivoPerso2;

        directorio = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "ejercicios" + File.separator + "ej08" + File.separator + "archivos";
        archivoTodos = directorio + File.separator + "todos.txt";
        archivoPerso1 = directorio + File.separator + "perso1.txt";
        archivoPerso2 = directorio + File.separator + "perso2.txt";

        TreeSet<Persona> perso1 = leerArchivo(archivoPerso1);
        TreeSet<Persona> perso2 = leerArchivo(archivoPerso2);
        TreeSet<Persona> todos = juntarPersonas(perso1, perso2);

        grabarArchivo(archivoTodos,todos);
    }

    private static void grabarArchivo(String rutaArchivo, TreeSet<Persona> todos) {
        try(BufferedWriter out = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Persona persona:todos){
                out.write(persona.toString());
                out.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static TreeSet<Persona> juntarPersonas(TreeSet<Persona> perso1, TreeSet<Persona> perso2) {
        TreeSet<Persona> aux = new TreeSet<>();
        aux.addAll(perso1);
        aux.addAll(perso2);
        return aux;
    }


    private static TreeSet<Persona> leerArchivo(String rutaArchivo){
        TreeSet<Persona> aux = new TreeSet<>();
        String nombre;

        try (BufferedReader in = new BufferedReader(new FileReader(rutaArchivo))){
            nombre = in.readLine();
            while (nombre!=null){
                aux.add(new Persona(nombre));
                nombre = in.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return aux;
    }
}
