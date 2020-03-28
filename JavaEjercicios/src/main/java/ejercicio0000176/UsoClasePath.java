package ejercicio0000176;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Ejercicio 176: Usar la clase Path en lugar de la clase File.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoClasePath {

    public static void main(String[] args) {
        
        Path rutaFuente = Paths.get("lenguajes.txt");
        
        if(rutaFuente.toFile().exists()){
            
            try {
                Path rutaDestino = Paths.get("lenguajes-copia-total.txt");
                
                Files.copy(rutaFuente, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
                
                System.out.println("La copia se ha realizado satisfactoriamente.");
                
            } catch (IOException e) {
                System.err.println("Error -> " + e.getMessage());
            }
            
        } else {
            System.out.println("El archivo especificado no existe.");
        }
    }
}
