package ejercicio0000296;

import ejercicio0000295.SolicitudRecursoXml;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Ejercicio 296: Convertir una cadena de resultado de una Solicitud GET en un documento XML.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionStringDocumentoXml {

    public static void main(String[] args) {
        String url = "https://randomuser.me/api/?results=5&format=XML";
        
        OkHttpClient cliente = new OkHttpClient();
        
        Request solicitud = new Request.Builder().url(url).build();
        
        try(Response respuesta = cliente.newCall(solicitud).execute()){
            System.out.println("Código de respuesta: " + respuesta.code());
            
            if(respuesta.isSuccessful()){
                String respuestaXml = respuesta.body().string();
                
                Document documentoXml = convertirCadenaADocumentoXml(respuestaXml);
                
                System.out.println("Nodo raíz: " + documentoXml.getFirstChild().getNodeName());
            }
        } catch (IOException ex) {
            Logger.getLogger(SolicitudRecursoXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Document convertirCadenaADocumentoXml(String cadenaXml){
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
}
