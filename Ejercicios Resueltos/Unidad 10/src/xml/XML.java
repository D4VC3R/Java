package xml;

import cuchiPandi.grupo.Grupo;
import cuchiPandi.mascota.Mascota;
import cuchiPandi.persona.Persona;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class XML {

    //Creación y escritura del XML
    public Document crearDocumentoXML() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.newDocument();
        Element root = doc.createElement("personas");
        doc.appendChild(root);
        return doc;
    }

    public void agregarGrupoXML(Grupo grupo, Document doc){
        Element root = doc.getDocumentElement();

        for (Persona persona : grupo.getGrupo()){
            //Crear el elemento o nodo persona.
            Element personaElement = doc.createElement("persona");
            root.appendChild(personaElement);

            //Añadir las etiquetas de persona (o sea, los atributos de persona) <nombre>
            Element nomPersona = doc.createElement("nombre");
            personaElement.appendChild(nomPersona);
            nomPersona.appendChild(doc.createTextNode(persona.getNombre()));
            //<edad>
            Element edadPersona = doc.createElement("edad");
            personaElement.appendChild(edadPersona);
            edadPersona.appendChild(doc.createTextNode(persona.getEdad()+""));

            //Añadir el nodo <mascota>
            Mascota mascota = persona.getMascota();
            Element mascotaPersona = doc.createElement(mascota.getClass().getSimpleName().toLowerCase());
            personaElement.appendChild(mascotaPersona);

            //Añadir las etiquetas <tipo> y <patas>
            Element tipoMascota = doc.createElement("tipo");
            mascotaPersona.appendChild(tipoMascota);
            tipoMascota.appendChild(doc.createTextNode(mascota.getTipo().toString()));

            Element numPatas = doc.createElement("patas");
            mascotaPersona.appendChild(numPatas);
            numPatas.appendChild(doc.createTextNode(mascota.getPatas()+""));
        }
    }

    public void guardarArchivo(Document doc, String rutaArchivo) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();

        DOMSource origen = new DOMSource(doc);
        StreamResult sr = new StreamResult(new File(rutaArchivo));

        transformer.transform(origen,sr);
    }

    //Leer Archivo XML
    //Paso 1: Lectura del archivo y carga en el Document

    public Document cargarXML(String rutaArchivo) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        return db.parse(new File(rutaArchivo));
    }

}
