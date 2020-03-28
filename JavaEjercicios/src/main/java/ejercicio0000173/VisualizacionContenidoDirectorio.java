package ejercicio0000173;

import java.io.File;
import java.util.Arrays;

/**
 * Ejercicio 173: Mostrar el contenido de un directorio con el método list 
 * de la clase File.
 * 
 * @author John Ortiz Ordoñez
 */
public class VisualizacionContenidoDirectorio {
    
    public static void main(String[] args) {
        
        final String RUTA_DIRECTORIO = ".";
        
        String[] contenido = new File(RUTA_DIRECTORIO).list();
        
        Arrays.sort(contenido);
        
        for (String archivo : contenido) {
            System.out.println(archivo);
        }
    }
}
