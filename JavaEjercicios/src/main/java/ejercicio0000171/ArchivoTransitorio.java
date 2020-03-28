package ejercicio0000171;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 171: Crear un archivo transitorio con nombre y eliminar al 
 * finalizar la aplicación.
 * 
 * @author John Ortiz Ordoñez
 */
public class ArchivoTransitorio {
    
    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO_TEMP = "temp.txt";
        
        try {
            File archivo = new File(NOMBRE_ARCHIVO_TEMP);
            archivo.deleteOnExit();
            
            // Escritura sobre el archivo:
            FileWriter fw = new FileWriter(archivo);
            fw.write("Contenido del archivo temporal...");
            fw.close();
            
            System.out.println("Presione Enter para continuar...");
            new Scanner(System.in).nextLine();
            
            System.out.println("El programa ha terminado.");
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
