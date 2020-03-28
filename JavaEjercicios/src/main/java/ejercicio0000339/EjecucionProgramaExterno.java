package ejercicio0000339;

import java.io.IOException;

/**
 * Ejercicio 339: Ejecutar un programa externo desde Java con el método Runtime.getRuntime().exec().
 * 
 * @author John Ortiz Ordoñez
 */
public class EjecucionProgramaExterno {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        Process proceso = Runtime.getRuntime().exec("notepad");
        
        proceso.waitFor();
    }
}
