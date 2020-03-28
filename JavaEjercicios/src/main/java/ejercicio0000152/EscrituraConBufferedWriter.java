package ejercicio0000152;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Ejercicio 152: Escritura sobre un archivo de texto con BufferedWriter.
 * 
 * @author John Ortiz Ordoñez
 */
public class EscrituraConBufferedWriter {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        try {
            
            OutputStream os = new FileOutputStream("bufferedwriter.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            
            String lenguaje;
            
            while(true){
                System.out.print("Escriba el nombre de un lenguaje de programación o -1 para terminar: ");
                lenguaje = entrada.nextLine();
                
                if (lenguaje.equals("-1")){
                    break;
                }
                
                bw.write(lenguaje);
                bw.write("\n");
            }
            
            bw.close();
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
