package ejercicio0000292;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Ejercicio 292: Leer un documento en formato XML y luego explorar su contenido.
 * 
 * @author John Ortiz Ordoñez
 */
public class LeerDocumentoXml {

    public static void main(String[] args) {
        
        try {
            File archivoXml = new File("G:\\Dropbox\\Pro\\Tutorship\\Java\\NetBeans\\JavaEjercicios\\src\\main\\java\\ejercicio0000292\\programas.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document documentoXml = builder.parse(archivoXml);
            
            documentoXml.getDocumentElement().normalize();
            
            System.out.println("Elemento raíz: " + documentoXml.getDocumentElement().getNodeName());
            
            NodeList programas = documentoXml.getElementsByTagName("programa");
            
            System.out.println("Contenido del documento:");
            System.out.println();
            
            for (int i = 0; i < programas.getLength(); i++) {
                Node programa = programas.item(i);
                
                System.out.println("Nombre elemento actual: " + programa.getNodeName());
                
                if (programa.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) programa;
                    
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("Nombre: " + element.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Versión: " + element.getElementsByTagName("version").item(0).getTextContent());
                    System.out.println("Desarrollador: " + element.getElementsByTagName("desarrollador").item(0).getTextContent());
                    
                }
                System.out.println();
            }
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
