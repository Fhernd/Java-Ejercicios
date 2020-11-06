package ejercicio0000424;

import java.time.Instant;

/**
 * Ejercicio 424: Obtener la marca temporal del sistema usando el método now() 
 * de Instant.
 *
 * @author John Ortiz Ordoñez
 */
public class MarcaTemporal {

    public static void main(String[] args) {
        
        Instant marcaTemporal = Instant.now();
        
        System.out.println("Marca temporal del sistema: " + marcaTemporal);
    }
}
