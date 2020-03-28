package ejercicio0000144;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * Ejercicio 144: Uso de la clase StreamTokenizer.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoStreamTokenizer {

    public static void main(String[] args) {
        
        FileReader fr = null;
        try {
            System.out.println("Uso de StringReader: ");
            StringReader stringReader = new StringReader("Java 8 es la versión más utilizada del JDK.");
            lecturaReader(stringReader);
            
            
            System.out.println("\nUso de FileReader:");
            
            String ruta = UsoStreamTokenizer.class.getResource("frases.txt").getPath();
            
            fr = new FileReader(ruta);
            
            lecturaReader(fr);
        } catch (FileNotFoundException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }
    
    public static void lecturaReader(Reader reader){
        try{
        StreamTokenizer st = new StreamTokenizer(reader);
        
        while(st.nextToken() != StreamTokenizer.TT_EOF){
            if (st.ttype == StreamTokenizer.TT_WORD){
                System.out.println("Palabra: " + st.sval);
            } else if (st.ttype == StreamTokenizer.TT_NUMBER){
                System.out.println("Número: " + st.nval);
            }
        }
        } catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
