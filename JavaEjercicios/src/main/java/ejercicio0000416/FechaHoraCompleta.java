package ejercicio0000416;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Ejercicio 416: Obtener la fecha y hora desde un objeto LocalTime usando 
 * atDate().
 *
 * @author John Ortiz Ordoñez
 */
public class FechaHoraCompleta {

    public static void main(String[] args) {
        
        LocalTime horaActual = LocalTime.now();
        System.out.println(horaActual);
        
        System.out.println();
        
        LocalDateTime fechaHoraActual = horaActual.atDate(LocalDate.of(2019, Month.MAY, 13));
        System.out.println(fechaHoraActual);
    }
}
