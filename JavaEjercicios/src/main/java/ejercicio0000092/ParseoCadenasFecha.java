package ejercicio0000092;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 92: Convertir cadenas de caracteres a fechas.
 * 
 * @author John Ortiz Ordoñez
 */
public class ParseoCadenasFecha {
    public static void main(String[] args) {
        
        // Conversión cadena de caracters a fecha:
        String cadenaFecha = "1984-05-21";
        LocalDate fecha1 = LocalDate.parse(cadenaFecha);
        System.out.println(fecha1);
        
        // Conversión cadena caracters (fecha/hora) a fecha:
        cadenaFecha = "1984-05-21T02:31:29";
        LocalDateTime fecha2 = LocalDateTime.parse(cadenaFecha);
        System.out.println("\n" + fecha2);
        
        // Conversión cadena caracteres con formato a fecha:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM uuuu");
        cadenaFecha = "02 Oct 1964";
        LocalDate fecha3 = LocalDate.parse(cadenaFecha, dtf);
        System.out.println("\n" + fecha3);
    }
}
