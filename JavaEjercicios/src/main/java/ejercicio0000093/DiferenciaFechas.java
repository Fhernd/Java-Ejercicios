package ejercicio0000093;

import java.time.LocalDate;
import java.time.Period;

/**n
 * Ejercicio 93: Computar la diferencia entre dos fechas.
 * 
 * @author John Ortiz Ordoñez
 */
public class DiferenciaFechas {
    public static void main(String[] args) {
        
        LocalDate año2000 = LocalDate.of(2000, 1, 1);
        LocalDate fechaActual = LocalDate.now();
        
        Period diferenciaFechas = Period.between(año2000, fechaActual);
        
        System.out.println(diferenciaFechas);
        System.out.println("Año: " + diferenciaFechas.getYears());
        System.out.println("Meses: " + diferenciaFechas.getMonths());
        System.out.println("Días: " + diferenciaFechas.getDays());
    }
}
