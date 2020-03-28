package ejercicio0000149;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 149: Escribir sobre un archivo de texto plano con la clase 
 * FileWriter.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoFileWriter {

    public static void main(String[] args) {
        
        try {
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("Escriba su lenguaje de programación favorito: ");
            String lenguaje = entrada.nextLine();
            
            FileWriter fw = new FileWriter("usofilewriter.txt");
            
            fw.write(lenguaje);
            
            fw.close();
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
