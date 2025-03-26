package cuchiPandi.pruebaXML;

import cuchiPandi.enumerado.TipoMascota;
import cuchiPandi.grupo.Grupo;
import cuchiPandi.mascota.Mascota;
import cuchiPandi.persona.Persona;
import org.w3c.dom.Document;
import xml.XML;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;


public class PruebaXML {
    public static void main(String[] args) {

        String directorioRaiz = System.getProperty("user.dir");
        String rutaDirectorio = directorioRaiz + File.separator + "src" + File.separator + "archivos";
        String rutaArchivo = rutaDirectorio + File.separator + "cuchipandi.xml";

        Grupo cuchipandi = new Grupo();

        cuchipandi.add(new Persona("Carla",20));
        cuchipandi.add(new Persona("Jordi",21,new Mascota(TipoMascota.HAMSTER,4)));
        cuchipandi.add(new Persona("Sergio",26,new Mascota(TipoMascota.PERRO,4)));

        System.out.println(cuchipandi);

        //Escribir en documento XML
        //Paso 1: Creación y construcción del documento (Document)

        XML archivo = new XML();
        Document docCuchipandi;

        //Crear y guardar documento
        try {
            docCuchipandi = archivo.crearDocumentoXML();
            archivo.agregarGrupoXML(cuchipandi,docCuchipandi);
            archivo.guardarArchivo(docCuchipandi, rutaArchivo);
        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }

        Document documento;
        //Crear y cargar documento existente
        /*try {
            documento = archivo.cargarXML(rutaArchivo);
            Grupo recuperarCuchiPandi = archivo.getGrupoFromXML(documento);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }*/


    }
}
