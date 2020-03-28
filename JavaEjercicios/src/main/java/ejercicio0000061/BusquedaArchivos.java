package ejercicio0000061;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 61: Encontrar los nombres de archivos que cumplan 
 * con un patrón.
 * 
 * @author John Ortiz Ordoñez
 */
public class BusquedaArchivos {
    private static final String RUTA = "D:\\Etc\\Docs\\Archivos";
    
    public static void main(String[] args) {
        File[] archivos = new File(RUTA).listFiles(archivo -> archivo.isFile());
        
        for (File archivo : archivos) {
            System.out.println(archivo.getName());
        }
        
        System.out.println("\nLibros de Dostoevsky:");
        
        String patron = "^[dD]ostoevsky";
        
        Pattern pattern = Pattern.compile(patron);
        
        for (File archivo : archivos) {
            Matcher matcher = pattern.matcher(archivo.getName());
            
            if(matcher.find()){
                System.out.println(archivo.getName());
            }
        }
    }
}
