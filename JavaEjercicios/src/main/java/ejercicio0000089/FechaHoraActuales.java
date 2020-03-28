package ejercicio0000089;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Ejercicio 89: Obtener la hora y fecha actuales.
 * 
 * @author John Ortiz Ordoñez
 */
public class FechaHoraActuales {
    public static void main(String[] args) {
        // Obtención de hora actual:
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
        
        // Obtención de la fecha actual:
        LocalDate fechaActual = LocalDate.now();
        System.out.println("\nFecha actual: " + fechaActual);
        
        // Obtención de la fecha y hora actuales:
        LocalDateTime fechaHoraActuales = LocalDateTime.now();
        System.out.println("\nFecha y hora actuales: " + fechaHoraActuales);
    }
}
