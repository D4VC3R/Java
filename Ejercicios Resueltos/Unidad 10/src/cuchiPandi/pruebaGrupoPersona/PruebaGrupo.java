package cuchiPandi.pruebaGrupoPersona;

import cuchiPandi.enumerado.TipoMascota;
import cuchiPandi.grupo.Grupo;
import cuchiPandi.mascota.Mascota;
import cuchiPandi.misclases.MyObjectOutputStream;
import cuchiPandi.persona.Persona;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.sql.SQLOutput;

public class PruebaGrupo {
    public static void main(String[] args) {


        String directorioRaiz = System.getProperty("user.dir");
        String rutaArchivo = directorioRaiz+ File.separator+"src"+File.separator+"archivos"+File.separator+"datos.dat";

        Grupo cuchiPandi = new Grupo();
        Grupo personajesDeLaTele;
        cuchiPandi.add(new Persona("Candela",20));
        cuchiPandi.add(new Persona("Jordi",20,new Mascota(TipoMascota.HAMSTER,4)));
        cuchiPandi.add(new Persona("Carla",20));
        cuchiPandi.add(new Persona("Ángel",20,new Mascota(TipoMascota.PERIQUITO,2)));

        grabarGrupo(cuchiPandi,rutaArchivo);
        personajesDeLaTele = assignarGrupo(rutaArchivo);

        for (Persona persona:personajesDeLaTele.getGrupo())
            System.out.println(persona);
        //for(Persona persona:cuchiPandi.getGrupo())
         //   grabarPersona(persona,rutaArchivo);
        //Grabar grupo en archivo binario - Persona a persona
        /*try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            for(Persona persona:cuchiPandi.getGrupo())
                flujoSalida.writeObject(persona);
            flujoSalida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());  */
        //Leer del archivo el grup de personas
        //System.out.println(leerArchivo(rutaArchivo));
    }

    private static Grupo assignarGrupo(String rutaArchivo) {
        Grupo aux = null;
        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(rutaArchivo));
            aux = (Grupo)flujoEntrada.readObject();
            System.out.println(aux);
            flujoEntrada.close();
        } catch (EOFException e){
            System.out.println("Archivo leído.");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return aux;
    }

    private static void grabarGrupo(Grupo grupo, String rutaArchivo) {
        try {
            //ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            MyObjectOutputStream flujoSalida = new MyObjectOutputStream(rutaArchivo);
            flujoSalida.writeObject(grupo);
            flujoSalida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leerArchivo(String rutaArchivo){
        String aux = "";
        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(rutaArchivo));
            //Persona persona = (Persona) flujoEntrada.readObject();

            while (true){
                aux += (Persona) flujoEntrada.readObject()+"\n";
            }

        } catch (EOFException e){
            System.out.println("Archivo leído.");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return aux;

    }
    public static void grabarPersona(Persona persona, String rutaArchivo){

        try {
            //ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            MyObjectOutputStream flujoSalida = new MyObjectOutputStream(rutaArchivo);

            flujoSalida.writeObject(persona);
            flujoSalida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    }

