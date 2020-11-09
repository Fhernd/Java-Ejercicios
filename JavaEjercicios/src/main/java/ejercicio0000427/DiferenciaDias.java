package ejercicio0000427;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.Month;

/**
 * Ejercicio 427: Calcular la diferencia en días entre dos fechas diferentes.
 *
 * @author John Ortiz Ordoñez
 */
public class DiferenciaDias {

    public static void main(String[] args) {
        
        LocalDate fechaAnterior = LocalDate.of(2019, Month.MAY, 13);
        LocalDate fechaPosterior = LocalDate.of(2019, Month.MAY, 21);
        
        System.out.println(fechaAnterior);
        System.out.println(fechaPosterior);
        
        System.out.println();
        
        long diferenciaDias = ChronoUnit.DAYS.between(fechaAnterior, fechaPosterior);
        
        System.out.println("La diferencia en días entre las dos fechas dadas es de " + diferenciaDias);
    }
}
