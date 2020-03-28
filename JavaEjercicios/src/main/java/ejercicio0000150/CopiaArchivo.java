package ejercicio0000150;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Ejercicio 150: Copiar un archivo.
 * 
 * @author John Ortiz Ordoñez
 */
public class CopiaArchivo {

    public static void main(String[] args) {
        
        try {
            String ruta = "D:\\Dropbox\\Pro\\Ejercicios\\Java\\EjerciciosJava\\src\\ejercicio0000150\\lenguajes.txt";
            
            Path fuente = Paths.get(ruta);
            Path destino = Paths.get("lenguajes-copia.txt");
            
            Files.copy(fuente, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
