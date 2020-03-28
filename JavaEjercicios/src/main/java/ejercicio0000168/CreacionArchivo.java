package ejercicio0000168;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 168: Creaer un archivo con el método createNewFile.
 *
 * @author John Ortiz Ordoñez
 */
public class CreacionArchivo {

    public static void main(String[] args) {

        List<String> listaArchivos = new ArrayList<>();
        listaArchivos.add("archivo-1.txt");
        listaArchivos.add("archivo-2.txt");
        listaArchivos.add("archivo-3.txt");
        listaArchivos.add("archivo-4.txt");
        
        for (String archivo : listaArchivos) {
            
            try {
                new File(archivo).createNewFile();
                
                System.out.printf("El archivo %s se ha creado de forma correcta.\n", archivo);
                
            } catch (IOException e) {
                System.err.println("Error -> " + e.getMessage());
            }
        }
    }
}
