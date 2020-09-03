package ejercicio0000352;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ejercicio 352: Capturar datos del usuario con un objeto BufferedReader.
 *
 * @author John Ortiz Ordoñez
 */
public class EntradaDatos {

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String valor = "";
        int numero;
        boolean numeroEsValido = false;
        
        do {            
            try {
                System.out.print("Ingrese un valor numérico: ");
                valor = entrada.readLine();
                System.out.println("Contenido de la variable «valor»: " + valor);
            } catch (IOException e) {
                System.out.println(e);
            }
            
            System.out.println();
            
            try {
                numero = Integer.parseInt(valor);
                numeroEsValido = true;
            } catch (NumberFormatException e) {
                System.out.println("No se ha podido convertir a entero el valor ingresado.");
            }
        } while (!numeroEsValido);
        
        System.out.println("El programa ha terminado.");
        
        try {
            entrada.close();
        } catch (IOException ex) {
            System.out.println("ERROR: Hay problemas al cerrar el recurso de entrada de datos.");
        }
    }
}
