package ejercicio0000095;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * Ejercicio 95: Convertir Fechas del API Legado.
 * 
 * @author John Ortiz Ordoñez
 */
public class APILegadoFechas {
    public static void main(String[] args) {
        
        // Conversión desde java.util.Date:
        Date fecha = new Date();
        System.out.println(fecha);
        
        LocalDateTime fechaNueva = LocalDateTime.ofInstant(fecha.toInstant(), ZoneId.systemDefault());
        
        System.out.println(fechaNueva);
        
        // Conversión desde java.util.Calendar:
        Calendar calendario = Calendar.getInstance();
        System.out.println("\n" + calendario);
        fechaNueva = LocalDateTime.ofInstant(calendario.toInstant(), ZoneId.systemDefault());
        System.out.println(fechaNueva);
    }
}
