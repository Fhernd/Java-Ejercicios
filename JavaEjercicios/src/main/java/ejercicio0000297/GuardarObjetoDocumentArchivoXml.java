package ejercicio0000297;

import ejercicio0000295.SolicitudRecursoXml;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Ejercicio 297: Guardar el contenido de un objeto Document en un archivo XML.
 *
 * @author John Ortiz Ordoñez
 */
public class GuardarObjetoDocumentArchivoXml {

    public static void main(String[] args) {
        String url = "https://randomuser.me/api/?results=5&format=XML";

        OkHttpClient cliente = new OkHttpClient();

        Request solicitud = new Request.Builder().url(url).build();

        try (Response respuesta = cliente.newCall(solicitud).execute()) {
            System.out.println("Código de respuesta: " + respuesta.code());

            if (respuesta.isSuccessful()) {
                String respuestaXml = respuesta.body().string();

                Document documentoXml = convertirCadenaADocumentoXml(respuestaXml);

                guardarObjetoDocumentEnArchivoXml(documentoXml);
            }
        } catch (IOException ex) {
            Logger.getLogger(SolicitudRecursoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Document convertirCadenaADocumentoXml(String cadenaXml) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = null;

        try {
            builder = factory.newDocumentBuilder();

            Document documentoXml = builder.parse(new InputSource(new StringReader(cadenaXml)));

            return documentoXml;
        } catch (IOException | ParserConfigurationException | SAXException e) {
            return null;
        }
    }

    public static void guardarObjetoDocumentEnArchivoXml(Document documentoXml) {
        try {
            DOMSource fuente = new DOMSource(documentoXml);
            FileWriter writer = new FileWriter(new File("users.xml"));
            StreamResult resultado = new StreamResult(writer);
            
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            
            transformer.transform(fuente, resultado);
        } catch(IOException e){
            e.printStackTrace();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(GuardarObjetoDocumentArchivoXml.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(GuardarObjetoDocumentArchivoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
