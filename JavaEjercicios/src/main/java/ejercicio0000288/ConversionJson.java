package ejercicio0000288;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 288: Obtener la representación en formato JSON desde una instancia de una clase.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionJson {

    public static void main(String[] args) {
        
        Persona edward = new Persona(1001, "Edward Ortiz", "edward@mail.co");
        
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            mapper.writeValue(System.out, edward);
        } catch (IOException ex) {
            Logger.getLogger(ConversionJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
