package ejercicio0000415;

import java.time.LocalTime;

/**
 * Ejercicio 415: Obtener la hora actual usando el método static now() de la 
 * clase LocalTime.
 *
 * @author John Ortiz Ordoñez
 */
public class HoraActual {

    public static void main(String[] args) {
        
        LocalTime horaActual = LocalTime.now();
        
        System.out.println(horaActual);
    }
}
