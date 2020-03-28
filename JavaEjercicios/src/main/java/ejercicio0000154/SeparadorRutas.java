package ejercicio0000154;

import java.io.File;

/**
 * Ejercicio 154: Usar el separador de rutas y archivos de la plataforma 
 * operacional de ejecución.
 * 
 * @author John Ortiz Ordoñez
 */
public class SeparadorRutas {
    public static void main(String[] args) {
        
        String separador = File.separator;
        
        // \, /
        
        System.out.println("Separador en Windows: " + separador);
    }
}
