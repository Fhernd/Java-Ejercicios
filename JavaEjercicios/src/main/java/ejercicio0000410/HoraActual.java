package ejercicio0000410;

import java.time.LocalTime;

/**
 * Ejercicio 410: Obtener la hora actual por medio del método static now() de la
 * clase LocalTime.
 *
 * @author John Ortiz Ordoñez
 */
public class HoraActual {

    public static void main(String[] args) {
        
        LocalTime horaActual = LocalTime.now();
        
        System.out.println("Hora actual: " + horaActual);
        
        System.out.println("Hora: " + horaActual.getHour());
        System.out.println("Minutos: " + horaActual.getMinute());
        System.out.println("Segundos: " + horaActual.getSecond());
        System.out.println("Nanosegundos: " + horaActual.getNano());
    }
}
