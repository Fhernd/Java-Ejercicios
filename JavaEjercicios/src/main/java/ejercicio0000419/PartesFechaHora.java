package ejercicio0000419;

import java.time.LocalDateTime;

/**
 * Ejercicio 419: Obtener las diferentes partes de una fecha y hora 
 * (LocalDateTime).
 *
 * @author John Ortiz Ordoñez
 */
public class PartesFechaHora {

    public static void main(String[] args) {
        
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println(fechaHoraActual);
        
        System.out.println();
        
        System.out.println("Mes: " + fechaHoraActual.getMonth());
        System.out.println("Mes (número): " + fechaHoraActual.getMonthValue());
        System.out.println("Día del mes: " + fechaHoraActual.getDayOfMonth());
        System.out.println("Día del año: " + fechaHoraActual.getDayOfYear());
        System.out.println("Año: " + fechaHoraActual.getYear());
        System.out.println("Hora: " + fechaHoraActual.getHour());
        System.out.println("Minutos: " + fechaHoraActual.getMinute());
        System.out.println("Segundos: " + fechaHoraActual.getSecond());
        System.out.println("Nanosegundos: " + fechaHoraActual.getNano());
    }
}
