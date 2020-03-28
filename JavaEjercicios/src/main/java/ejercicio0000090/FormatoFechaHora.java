package ejercicio0000090;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 90: Formatear horas y fechas con la clase DateTimeFormatter.
 *
 * @author John Ortiz Ordoñez
 */
public class FormatoFechaHora {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(dtf.format(LocalDate.now()));
        
        System.out.println(LocalDate.parse("2013/04/13", dtf));
        
        dtf = DateTimeFormatter.ofPattern("d M, yyyy h:mm a");
        
        System.out.println(ZonedDateTime.now().format(dtf));
    }
}
