package ejercicio0000146;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Ejercicio 146: Leer un archivo de texto con la clase FileInputStream.
 * 
 * @author John Ortiz Ordoñez
 */
public class LecturaFlujos {
    
    public static void main(String[] args) {
        
        try{
            
            String ruta = LecturaFlujos.class.getResource("lenguajes.txt").getPath();
            
            FileInputStream fis = new FileInputStream(ruta);
            
            int valor;
            
            while((valor = fis.read()) != -1){
                System.out.print((char)valor);
            }
            
        } catch(IOException ex){
            System.err.println("Error -> " + ex.getMessage());
        }
    }
}
