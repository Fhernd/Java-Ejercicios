package ejercicio0000166;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ejercicio 166: Listar el contenido de un directorio por medio de la clase 
 * Files.
 * 
 * @author John Ortiz Ordoñez
 */
public class ListadoDirectorio {

    public static void main(String[] args) {
        
        final String NOMBRE_DIRECTORIO = "C:\\Windows";
        
        try(DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get(NOMBRE_DIRECTORIO))){
            
            for(Path ruta : ds){
                System.out.println(ruta.getFileName());
            }
        } catch(IOException e){
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
