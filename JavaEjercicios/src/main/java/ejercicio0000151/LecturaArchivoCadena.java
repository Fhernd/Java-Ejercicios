package ejercicio0000151;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Ejercicio 151: Leer el contenido de un archivo de texto en un objeto 
 * String.
 * 
 * @author John Ortiz Ordoñez
 */
public class LecturaArchivoCadena {

    public static void main(String[] args) {
        
        String ruta = LecturaArchivoCadena.class.getResource("lenguajes.txt").getPath();
        
        try {
            InputStream is = new FileInputStream(ruta);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            String linea = br.readLine();
            StringBuilder sb = new StringBuilder();
            
            while(linea != null){
                sb.append(linea);
                sb.append("\n");
                linea = br.readLine();
            }
            
            System.out.println(sb);
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error -> " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error -> " + ex.getMessage());
        }
    }
}
