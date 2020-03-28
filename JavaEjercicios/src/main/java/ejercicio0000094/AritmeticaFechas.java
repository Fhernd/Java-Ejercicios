package ejercicio0000094;

import java.time.LocalDate;
import java.time.Period;

/**
 * Ejercicio 94: Adicionar o sustraer fechas.
 * 
 * @author John Ortiz Ordoñez
 */
public class AritmeticaFechas {
    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.ofDays(317);
        
        LocalDate fechaNueva = fechaActual.plus(periodo);
        
        System.out.println("Actual: " + fechaActual);
        System.out.println("Fecha nueva: " + fechaNueva);
        
        periodo = Period.ofDays(317);
        
        fechaNueva = fechaActual.minus(periodo);
        
        System.out.println("\nActual: " + fechaActual);
        System.out.println("Fecha nueva: " + fechaNueva);
    }
}
