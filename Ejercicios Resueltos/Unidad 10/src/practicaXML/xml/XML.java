package practicaXML.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import practicaXML.autor.Autor;
import practicaXML.enumerado.Editorial;
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
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
                libroElement.setAttribute("cantidad", String.valueOf(registro.getValue()));
                Element autoresElement = doc.createElement("autores");
                libroElement.appendChild(autoresElement);


                // Añadir los atributos del autor
                for (Autor autor : registro.getKey().getAutor()) {
                    // Crear el elemento autor
                    Element autorElement = doc.createElement("autor");
                    // Crear los elementos hijo del autor
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
                    // Me gustaría que si hay un solo autor, añadirlo directamente al libro y si no, crear un elemento autores y añadir ahi cada autor.
                    autoresElement.appendChild(autorElement);

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
    public static Document leerXML(String rutaArchivo) throws ParserConfigurationException, IOException, SAXException {
        // Implementar la lectura del XML si es necesario
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        // Leer el archivo XML y cargarlo en un objeto Document
        return db.parse(new File(rutaArchivo));
    }


    public static Libreria getLibreriaFromXML(Document doc){
        // Implementar la lectura del XML y la creación de la librería
        Libreria libreria = new Libreria();
        Element rootElement = doc.getDocumentElement();

        // Obtener los libros
        NodeList libros = rootElement.getElementsByTagName("libro");

        for (int i = 0; i < libros.getLength(); i++) {
            String tit=null, isbn=null, e = null;
            int anyo = 0, cant;
            double precio = 0.0;
            Set<Autor> aut = new HashSet<>();
            String nom = null, ap1 = null, ap2 = null, nac = null;

            Node libro = libros.item(i);
            cant = Integer.parseInt(libro.getAttributes().item(0).getNodeValue());
            NodeList atributosLibro = libro.getChildNodes();


            for (int j = 0; j < atributosLibro.getLength(); j++) {

                Node atributo = atributosLibro.item(j);
                if (atributo.getNodeType() == Node.ELEMENT_NODE){
                    // j==0 titulo j==1 autor j==2 editorial j==3 isbn j==4 año j==5 precio
                    switch (j){
                        case 0: tit = atributo.getFirstChild().getNodeValue();
                        break;
                        case 1: NodeList autores = atributo.getChildNodes();// Comprobar cuantos autores hay y recorrer sus atributos (la z de la variable es porque me di cuenta de que me estaba saltando este paso demasiado tarde)
                            for (int z = 0; z < autores.getLength(); z++) {
                                Node autor = autores.item(z);
                                NodeList atributosAutor = autor.getChildNodes();
                                for (int k = 0; k < atributosAutor.getLength(); k++) {
                                    switch (k){
                                        case 0: nom = atributosAutor.item(k).getFirstChild().getNodeValue();
                                            break;
                                        case 1: ap1 = atributosAutor.item(k).getFirstChild().getNodeValue();
                                            break;
                                        case 2: ap2 = atributosAutor.item(k).getFirstChild().getNodeValue();
                                            break;
                                        default: nac = atributosAutor.item(k).getFirstChild().getNodeValue();
                                            aut.add(new Autor(nom,ap1,ap2,nac));
                                            break;
                                    }
                                }
                            }
                        case 2: e = atributo.getFirstChild().getNodeValue();// A lo mejor hace falta poner el nombre en uppercase
                        break;
                        case 3: isbn = atributo.getFirstChild().getNodeValue();
                        break;
                        case 4: anyo = Integer.parseInt(atributo.getFirstChild().getNodeValue());
                        break;
                        default: precio = Double.parseDouble(atributo.getFirstChild().getNodeValue());
                        break;
                    }
                }
            }
            //Añadir el libro a la librería (también se podría crear primero una instancia de libro con todos los atributos y añadirlo después a la librería)
            libreria.addLibro(new Libro(tit,aut,Editorial.valueOf(e.toUpperCase()),isbn,anyo,precio),cant);
        }
        return libreria;
    }
}
