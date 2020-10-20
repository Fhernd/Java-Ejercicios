package ejercicio0000411;

import java.time.Clock;
import java.time.LocalDate;

/**
 * Ejercicio 411: Usar la función now() de LocalDate para obtener la fecha desde
 * el reloj del sistema.
 *
 * @author John Ortiz Ordoñez
 */
public class FechaRelojSistema {

    public static void main(String[] args) {
        
        Clock relojSistema = Clock.systemUTC();
        System.out.println(relojSistema);
        
        System.out.println();
        
        LocalDate fechaActual = LocalDate.now(relojSistema);
        System.out.println(fechaActual);
    }
}
