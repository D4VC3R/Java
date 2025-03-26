package json.prueba;

import cuchiPandi.enumerado.TipoMascota;
import cuchiPandi.grupo.Grupo;
import cuchiPandi.mascota.Mascota;
import cuchiPandi.persona.Persona;
import json.myjson.MyJSON;

import java.io.File;

public class PruebaJSON {
    public static void main(String[] args) {

        String directorioRaiz = System.getProperty("user.dir");
        String rutaDirectorio = directorioRaiz + File.separator + "src" + File.separator + "archivos";
        String rutaArchivo = rutaDirectorio + File.separator + "cuchipandi.json";

        Grupo cuchipandi = new Grupo();

        cuchipandi.add(new Persona("Carla",20));
        cuchipandi.add(new Persona("Jordi",21,new Mascota(TipoMascota.HAMSTER,4)));
        cuchipandi.add(new Persona("Sergio",26,new Mascota(TipoMascota.PERRO,4)));
        cuchipandi.add(new Persona("Miguel Ángel",22,new Mascota(TipoMascota.PERIQUITO,4)));

        String cuchipandiJSON = MyJSON.objetoToJSON(cuchipandi);
        MyJSON.grabarJSON(cuchipandiJSON,rutaArchivo);

        Grupo cuchi2 = null;
        String cad = MyJSON.leerJSON(rutaArchivo);
        cuchi2 = (Grupo)MyJSON.jsonToObject(cad,Grupo.class);

        System.out.println(cuchi2);



    }
}
