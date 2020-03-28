package ejercicio0000289;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 * Ejercicio 289: Crear un objeto a partir de los datos contenidos en un archivo JSON.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionArchivoJson {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            
            Persona edward = mapper.readValue(new File("G:\\Dropbox\\Pro\\Tutorship\\Java\\NetBeans\\JavaEjercicios\\src\\main\\java\\ejercicio0000289\\edward.json"), Persona.class);
            
            System.out.println("ID: " + edward.getId());
            System.out.println("Nombre: " + edward.getNombre());
            System.out.println("Correo Electrónico: " + edward.getCorreoElectronico());
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
