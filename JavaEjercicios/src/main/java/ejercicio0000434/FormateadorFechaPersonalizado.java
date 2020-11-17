package ejercicio0000434;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 434: Usar un formateador de fecha personalizado con la clase 
 * DateTimeFormatter.
 *
 * @author John Ortiz Ordoñez
 */
public class FormateadorFechaPersonalizado {

    public static void main(String[] args) {
        
        String fechaTexto = "2013/04/23";
        
        try {
            DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            
            LocalDate fecha = LocalDate.parse(fechaTexto, formateadorFecha);
            
            System.out.println(fecha);
            System.out.println("Año: " + fecha.getYear());
            System.out.println("Mes: " + fecha.getMonth());
            System.out.println("Día: " + fecha.getDayOfWeek());
        } catch (Exception e) {
        }
    }
}
