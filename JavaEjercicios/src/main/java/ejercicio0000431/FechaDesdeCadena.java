package ejercicio0000431;

import java.time.LocalDate;

/**
 * Ejercicio 431: Crear una fecha desde un texto con el método parse() de la 
 * clase LocalDate.
 *
 * @author John Ortiz Ordoñez
 */
public class FechaDesdeCadena {
    
    public static void main(String[] args) {
        
        String fechaTexto = "2020-11-13";
        LocalDate fecha = LocalDate.parse(fechaTexto);
        
        System.out.println("La fecha es: " + fecha);
        System.out.println("Año: " + fecha.getYear());
        System.out.println("Mes: " + fecha.getMonth());
        System.out.println("Día: " + fecha.getDayOfMonth());
    }
}
