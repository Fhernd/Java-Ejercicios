package ejercicio0000155;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ejercicio 155: Establecer un set de caracteres al momento de 
 * escribir contenido en un archivo.
 * 
 * @author John Ortiz Ordoñez
 */
public class CambioJuegoCaracteres {
    
    public static void main(String[] args) {
        
        Charset cs = Charset.forName("UTF-8");
        String contenido = "Java es tremendo!";
        BufferedWriter bw = null;
        Path archivo = Paths.get("contenido.txt");
        
        try {
            bw = Files.newBufferedWriter(archivo, cs);
            
            bw.write(contenido);
            
            bw.close();
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
