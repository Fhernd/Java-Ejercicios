package ejercicio0000178;

import java.io.File;
import java.nio.file.Path;

/**
 * Ejercicio 178: Convertir de File a Path con el método toPath.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionFilePath {

    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "lenguajes.txt";
        
        File archivo = new File(NOMBRE_ARCHIVO);
        
        Path p = archivo.toPath();
        
        if (!p.isAbsolute()){
            
            Path rutaAbsoluta = p.toAbsolutePath();
            
            System.out.println("Ruta absoluta: " + rutaAbsoluta);
        }
    }
}
