package ejercicio0000145;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ejercicio 145: Leer el contenido de un archivo con la clase Scanner.
 * 
 * @author John Ortiz Ordoñez
 */
public class ScannerArchivo {

    public static void main(String[] args) {
        
        String ruta = ScannerArchivo.class.getResource("emails.txt").getPath();
        
        File archivoEmails = new File(ruta);
        
        try {
            Scanner lectorArchivo = new Scanner(archivoEmails);
            
            while(lectorArchivo.hasNext()){
                System.out.println(lectorArchivo.next());
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }
}
