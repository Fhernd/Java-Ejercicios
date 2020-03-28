package ejercicio0000287;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 287: Procesamiento de datos en formato JSON con la API Jackson.
 * 
 * @author John Ortiz Ordoñez
 */
public class ProcesamientoJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        
        String personaJson = "{\"id\": 1001, \"nombre\": \"Edward Ortiz\", \"correoElectronico\": \"edward@mail.co\"}";
        
        try {
            Persona edward = mapper.readValue(personaJson, Persona.class);
            
            System.out.println("Nombre: " + edward.getNombre());
            System.out.println("Correo electrónico: " + edward.getCorreoElectronico());
            
        } catch (IOException ex) {
            Logger.getLogger(ProcesamientoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
