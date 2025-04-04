package practicaXML.prueba;

import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;
import org.w3c.dom.Document;
import practicaXML.autor.Autor;
import practicaXML.enumerado.Editorial;
import practicaXML.json.MyJSON;
import practicaXML.libreria.Libreria;
import practicaXML.libro.Libro;
import practicaXML.xml.XML;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String rutaArchivo = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "practicaXML" + File.separator + "archivos" + File.separator + "libreria.xml";

        Libreria noveldense = new Libreria();
        Autor a1 = new Autor("Perico", "Palotes", "González", "Española");
        Autor a2 = new Autor("Pancho", "Poncho", "Pincho", "Española");
        Autor a3 = new Autor("Juan", "Pérez", "González", "Española");
        Libro l1 = new Libro("El Secreto de Perico", Set.of(a1) , Editorial.ANAYA, "1234567890", 1990, 20.5);
        Libro l2 = new Libro("La Vida de Pancho", Set.of(a2) , Editorial.SM, "0987654321", 1991, 25.5);
        Libro l3 = new Libro("Pues si que estamos bien", Set.of(a3) , Editorial.ALIANZA, "1239874560", 1992, 30.5);
        Libro l4 = new Libro("El Trio Calavera", Set.of(a1, a2, a3) , Editorial.PLANETA, "1234567896", 1993, 35.5);


        noveldense.addLibro(l1, 5);
        noveldense.addLibro(l2, 10);
        noveldense.addLibro(l3, 15);
        noveldense.addLibro(l4, 20);
        

        try {
            Document doc = XML.crearXML();
            XML.addLibreria(doc, noveldense);
            XML.guardarXML(doc, rutaArchivo);
            System.out.println("XML creado correctamente en: " + rutaArchivo);
        } catch (ParserConfigurationException e) {
            System.out.println("Error al crear el XML: " + e.getMessage());
        }

        Libreria noveldense2 = new Libreria();

        try {
            Document doc = XML.leerXML(rutaArchivo);
            noveldense2 = XML.getLibreriaFromXML(doc);
            System.out.println(noveldense2);
        } catch (Exception e) {
            System.out.println("Error al leer el XML: " + e.getMessage());
        }

    }
}
