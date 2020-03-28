package ejercicio0000147;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 147: Escribir un archivo de texto con la clase FileOutputStream.
 * 
 * @author John Ortiz Ordoñez
 */
public class EscrituraFlujosBytes {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba una cadena de caracteres: ");
        String cadena = entrada.nextLine();
        
        try{
            FileOutputStream fos = new FileOutputStream("informacion.txt");
            
            for (int i = 0; i < cadena.length(); i++) {
                fos.write((int) cadena.charAt(i));
            }
        } catch(IOException ex){
            System.err.println("Error -> " + ex.getMessage());
        }
    }
}
