package ejercicio0000298;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Ejercicio 298: Buscar contenido en un documento XML por medio de XPath.
 * 
 * @author John Ortiz Ordoñez
 */
public class BusquedaContenidoDocumentoXml {

    public static void main(String[] args) {
        String cadenaXml = "<?xml version=\"1.0\"?>\n"
                + "<programas>\n"
                + "    <programa id=\"1001\">\n"
                + "        <nombre>Visual Studio Code</nombre>\n"
                + "        <version>1.43.0</version>\n"
                + "        <desarrollador>Microsoft</desarrollador>\n"
                + "    </programa>\n"
                + "    <programa id=\"1002\">\n"
                + "        <nombre>Notepad++</nombre>\n"
                + "        <version>7.5.9</version>\n"
                + "        <desarrollador>Notepad++ Team</desarrollador>\n"
                + "    </programa>\n"
                + "</programas>\n"
                + "";

        try{
            DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document documentoXml = parser.parse(new ByteArrayInputStream(cadenaXml.getBytes()));
            
            XPath xpath = XPathFactory.newInstance().newXPath();
            
            String cadenaConsulta = "//programa[@id=1002]/nombre";
            
            String nombrePrograma = xpath.evaluate(cadenaConsulta, documentoXml);
            
            System.out.println(nombrePrograma);
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            Logger.getLogger(BusquedaContenidoDocumentoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
