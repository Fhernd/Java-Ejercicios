package ejercicio0000165;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ejercicio 165: Obtener el tamaño de un archivo usando la clase Files.
 *
 * @author John Ortiz Ordoñez
 */
public class ObtencionTamagnioArchivo {

    public static void main(String[] args) {

        final String NOMBRE_STRING = "lenguajes.txt";
        
        try {
            Path ruta = Paths.get(NOMBRE_STRING);
            
            long tamagnio = Files.size(ruta);
            
            System.out.printf("El tamaño del archivo %s es de %d bytes.\n", NOMBRE_STRING, tamagnio);
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
