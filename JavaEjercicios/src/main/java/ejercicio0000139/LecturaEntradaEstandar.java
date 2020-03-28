package ejercicio0000139;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ejercicio 139: Leer datos desde la entrada estándar.
 * 
 * @author John Ortiz Ordoñez
 */
public class LecturaEntradaEstandar {

    public static void main(String[] args) {
        
        String lineaTexto = null;
        int valor;
        
        try {
            
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            
            System.out.print("Escriba un número: ");
            lineaTexto = br.readLine();
            
            valor = Integer.parseInt(lineaTexto);
            
            System.out.println("\nNúmero digitado: " + valor);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
