package ejercicio0000294;

import ejercicio0000293.Computador;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Ejercicio 294: Convertir un objeto en un documento en formato XML.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionObjetoArchivoXml {
    
    public static void main(String[] args) {
        Computador msi = new Computador(1001, "MSi", 2019);
        
        convertirObjetoAXml(msi);
    }

    public static void convertirObjetoAXml(Computador computador){
        try {
            JAXBContext contexto = JAXBContext.newInstance(Computador.class);
            Marshaller marshaller = contexto.createMarshaller();
            
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            
            File archivoXml = new File("computador.xml");
            
            marshaller.marshal(computador, archivoXml);
        } catch (JAXBException e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }
}
