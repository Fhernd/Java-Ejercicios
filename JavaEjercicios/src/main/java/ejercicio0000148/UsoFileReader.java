package ejercicio0000148;

import java.io.FileReader;
import java.io.IOException;

/**
 * Ejercicio 148: Leer un archivo de texto con un objeto FileReader.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoFileReader {

    public static void main(String[] args) {
        
        try{
            String ruta = UsoFileReader.class.getResource("lenguajes.txt").getPath();
            
            FileReader fr = new FileReader(ruta);
            int caracter;
            
            while((caracter = fr.read()) != -1){
                System.out.print((char) caracter);
            }
        } catch(IOException ex){
            System.err.println("Error -> " + ex.getMessage());
        }
    }
}
