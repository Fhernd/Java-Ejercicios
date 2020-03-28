package ejercicio0000177;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ejercicio 177: Convertir una ruta relativa en una ruta absoluta con la clase 
 * Path.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionRutas {

    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "lenguajes.txt";
        
        Path rutaRelativa = Paths.get(NOMBRE_ARCHIVO);
        
        System.out.println("Ruta relativa: " + rutaRelativa);
        
        Path rutaAbsoluta = rutaRelativa.toAbsolutePath();
        
        System.out.println("\nRuta absoluta: " + rutaAbsoluta);
    }
}
