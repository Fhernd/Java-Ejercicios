package ejercicio0000293;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Ejercicio 293: Convertir un objeto en una cadena en formato XML.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionObjetoCadenaXml {

    public static void main(String[] args) {
        Computador msi = new Computador(1001, "MSi", 2019);
        
        String contenido = convertirObjetoAXml(msi);
        
        System.out.println(contenido);
    }
    
    public static String convertirObjetoAXml(Computador computador){
        try {
            JAXBContext contexto = JAXBContext.newInstance(Computador.class);
            Marshaller marshaller = contexto.createMarshaller();
            
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            StringWriter writer = new StringWriter();
            
            marshaller.marshal(computador, writer);
            
            String contenidoXml = writer.toString();
            
            return contenidoXml;
        } catch (JAXBException e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
            
            return null;
        }
    }
}
