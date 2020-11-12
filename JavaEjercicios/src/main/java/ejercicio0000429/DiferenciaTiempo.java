package ejercicio0000429;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Ejercicio 429: Obtener la diferencia en años, meses y días entre dos fechas 
 * diferentes.
 *
 * @author John Ortiz Ordoñez
 */
public class DiferenciaTiempo {

    public static void main(String[] args) {
        
        LocalDate primeraFecha = LocalDate.of(2000, Month.JANUARY, 1);
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("Primera fecha: " + primeraFecha);
        System.out.println("Fecha actual: " + fechaActual);
        
        System.out.println();
        
        Period periodo = Period.between(primeraFecha, fechaActual);
        System.out.println("Diferencia en años: " + periodo.getYears());
        System.out.println("Diferencia en meses: " + periodo.getMonths());
        System.out.println("Diferencia en días: " + periodo.getDays());
    }
}
