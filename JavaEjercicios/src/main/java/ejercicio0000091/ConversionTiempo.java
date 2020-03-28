package ejercicio0000091;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Ejercicio 91: Convertir entre fechas, horas y segundos Unix.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionTiempo {
    public static void main(String[] args) {
        
        // Convertir de segundos Unix a fecha/hora:
        Instant horaFechaDesdeUnix = Instant.ofEpochSecond(10000000L);
        System.out.println(horaFechaDesdeUnix);
        
        // Convertir desde segundos Unix a Zona horaria:
        ZoneId zonaActual = ZoneId.systemDefault();
        ZonedDateTime ahora = ZonedDateTime.ofInstant(horaFechaDesdeUnix, zonaActual);
        System.out.println("\n" + ahora);
        
        // Conversión zona horaria:
        LocalDateTime fechaHoraActuales = LocalDateTime.now();
        ZonedDateTime londres = fechaHoraActuales.atZone(ZoneId.of("Europe/London"));
        System.out.println("\n" + londres);
    }
}
