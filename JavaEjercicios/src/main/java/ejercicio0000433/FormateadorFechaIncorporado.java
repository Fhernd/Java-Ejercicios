package ejercicio0000433;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 433: Usar un formateador de fechas incorporado para crear una 
 * fecha desde un texto.
 *
 * @author John Ortiz Ordoñez
 */
public class FormateadorFechaIncorporado {

    public static void main(String[] args) {
        
        String fechaTexto = "2020-11-17";
        
        LocalDate fecha = LocalDate.parse(fechaTexto, DateTimeFormatter.ISO_DATE);
        
        System.out.println("Fecha: " + fecha);
    }
}
