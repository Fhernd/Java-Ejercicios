package ejercicio0000432;

import java.time.LocalDateTime;

/**
 * Ejercicio 432: Obtener una fecha tipo LocalDateTime desde una cadena de
 * caracteres con parse().
 *
 * @author John Ortiz Ordoñez
 */
public class FechaHoraCadena {

    public static void main(String[] args) {
        
        String fechaHoraTexto = "2020-11-13T15:47:29";
        
        LocalDateTime fechaHora = LocalDateTime.parse(fechaHoraTexto);
        System.out.println(fechaHora);
        System.out.println("Año: " + fechaHora.getYear());
        System.out.println("Mes: " + fechaHora.getMonth());
        System.out.println("Día: " + fechaHora.getDayOfMonth());
        System.out.println("Hora: " + fechaHora.getHour());
        System.out.println("Minutos: " + fechaHora.getMinute());
        System.out.println("Segundos: " + fechaHora.getSecond());
    }
}
