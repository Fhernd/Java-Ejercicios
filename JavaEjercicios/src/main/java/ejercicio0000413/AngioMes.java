package ejercicio0000413;

import java.time.Month;
import java.time.YearMonth;

/**
 * Ejercicio 413: Obtener la combinación año y mes a partir del método 
 * YearMonth.now().
 *
 * @author John Ortiz Ordoñez
 */
public class AngioMes {

    public static void main(String[] args) {
        
        YearMonth mesAgnioActual = YearMonth.now();
        
        System.out.println(mesAgnioActual);
        
        System.out.println();
        
        // Solución #2: Uso del método YearMonth.of():
        YearMonth agnioMesEspecifico = YearMonth.of(2019, Month.MAY);
        System.out.println(agnioMesEspecifico);
    }
}
