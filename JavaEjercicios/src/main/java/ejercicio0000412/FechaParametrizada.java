package ejercicio0000412;

import java.time.LocalDate;
import java.time.Month;

/**
 * Ejercicio 412: Crear una fecha a partir de datos concretos para año, mes y 
 * día.
 *
 * @author John Ortiz Ordoñez
 */
public class FechaParametrizada {
    
    public static void main(String[] args) {
        
        LocalDate fechaEspecifica = LocalDate.of(2020, Month.OCTOBER, 22);
        
        System.out.println("La fecha específica es: " + fechaEspecifica);
    }
}
