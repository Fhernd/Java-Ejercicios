package ejercicio0000167;

import java.io.File;
import java.io.IOException;

/**
 * Ejercicio 167: Obtener datos de un archivo con la clase File.
 *
 * @author John Ortiz Ordoñez
 */
public class ObtencionInformacionArchivo {

    public static void main(String[] args) {

        final String NOMBRE_ARCHIVO = "lenguajes.txt";

        File archivo = new File(NOMBRE_ARCHIVO);

        if (archivo.exists()) {
            try {
                System.out.println("Ruta canónica: " + archivo.getCanonicalPath());
                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Directorio padre: " + archivo.getParent());
                System.out.println("¿El archivo se puede leer?: " + archivo.canRead());
                System.out.println("¿El archivo se puede escribir?: " + archivo.canWrite());
                System.out.println("Última fecha de modificación: " + archivo.lastModified());
                System.out.println("Tamaño: " + archivo.length());
                System.out.println("¿Archivo?: " + archivo.isFile());
                
            } catch (IOException e) {
                System.err.println("Error -> " + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
