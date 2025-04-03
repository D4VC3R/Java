package practicaXML.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import practicaXML.autor.Autor;
import practicaXML.libreria.Libreria;
import practicaXML.libro.Libro;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Map;

public class XML {

    public static Document crearXML() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        // Crear el documento XML
        Document doc = db.newDocument();
        // Crear el elemento raíz
        Element root = doc.createElement("Libreria");
        // Añadir el elemento raíz al documento
        doc.appendChild(root);
        return doc;
    }

    public static void addLibreria(Document doc, Libreria libreria){
        try {

            Element root = doc.getDocumentElement();
            // Recorrer el stock de la librería
            for (Map.Entry<Libro, Integer> registro : libreria.getStock().entrySet()) {
                // Crear el elemento libro
                Element libroElement = doc.createElement("libro");
                root.appendChild(libroElement);
                // Crear los elementos hijo del libro (atributos del libro)
                Element tituloElement = doc.createElement("titulo");
                tituloElement.appendChild(doc.createTextNode(registro.getKey().getTitulo()));
                libroElement.appendChild(tituloElement);
                // Crear el elemento cantidad y añadirlo como atributo del libro
                tituloElement.setAttribute("cantidad", String.valueOf(registro.getValue()));

                //Crear el elemento autor
                Element autorElement = doc.createElement("autor");
                // Añadir los atributos del autor
                for (Autor autor : registro.getKey().getAutor()) {
                    Element autorNombre = doc.createElement("nombre");
                    autorNombre.appendChild(doc.createTextNode(autor.getNombre()));
                    autorElement.appendChild(autorNombre);
                    Element autorApellido1 = doc.createElement("apellido1");
                    autorApellido1.appendChild(doc.createTextNode(autor.getApellido1()));
                    autorElement.appendChild(autorApellido1);
                    Element autorApellido2 = doc.createElement("apellido2");
                    autorApellido2.appendChild(doc.createTextNode(autor.getApellido2()));
                    autorElement.appendChild(autorApellido2);
                    Element autorNacionalidad = doc.createElement("nacionalidad");
                    autorNacionalidad.appendChild(doc.createTextNode(autor.getNacionalidad()));
                    autorElement.appendChild(autorNacionalidad);
                    // Añadir el elemento autor al libro
                    libroElement.appendChild(autorElement);
                }
                // Crear el elemento editorial
                Element editorialElement = doc.createElement("editorial");
                editorialElement.appendChild(doc.createTextNode(registro.getKey().getEditorial().getNombre()));
                libroElement.appendChild(editorialElement);
                // Crear el elemento ISBN
                Element isbnElement = doc.createElement("isbn");
                isbnElement.appendChild(doc.createTextNode(registro.getKey().getIsbn()));
                libroElement.appendChild(isbnElement);
                // Crear el elemento año de publicación
                Element anyoElement = doc.createElement("anyoPublicacion");
                anyoElement.appendChild(doc.createTextNode(String.valueOf(registro.getKey().getAnyoPublicacion())));
                libroElement.appendChild(anyoElement);
                // Crear el elemento precio
                Element precioElement = doc.createElement("precio");
                precioElement.appendChild(doc.createTextNode(String.valueOf(registro.getKey().getPrecio())));
                libroElement.appendChild(precioElement);
                // Añadir el libro al elemento raíz
                root.appendChild(libroElement);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // Guardar el documento XML en un archivo
    public static void guardarXML(Document doc, String rutaArchivo) {
        try {
            // Crear un transformador para escribir el documento XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // Configurar la salida del transformador
            DOMSource source = new DOMSource(doc);
            // Crear el archivo de salida
            StreamResult result = new StreamResult(new File(rutaArchivo));
            // Escribir el documento XML en el archivo
            transformer.transform(source, result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
