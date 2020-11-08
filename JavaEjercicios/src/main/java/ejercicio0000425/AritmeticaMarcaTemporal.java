package ejercicio0000425;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * Ejercicio 425: Efectuar operaciones aritméticas sobre marcas temporales 
 * con un objeto Instant.
 *
 * @author John Ortiz Ordoñez
 */
public class AritmeticaMarcaTemporal {

    public static void main(String[] args) {
        
        Instant marcaTemporal = Instant.now();
        System.out.println(marcaTemporal);
        
        System.out.println();
        
        Instant marcaTemporal5DiasDespues = marcaTemporal.plus(5, ChronoUnit.DAYS);
        System.out.println(marcaTemporal5DiasDespues);
        
        System.out.println();
        
        Instant marcaTemporal5MinutosAntes = marcaTemporal.minus(5, ChronoUnit.MINUTES);
        System.out.println(marcaTemporal5MinutosAntes);
    }
}
