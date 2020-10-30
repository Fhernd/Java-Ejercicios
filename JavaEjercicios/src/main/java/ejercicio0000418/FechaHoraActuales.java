package ejercicio0000418;

import java.time.LocalDateTime;

/**
 * Ejercicio 418: Usar el método now() de LocalDateTime para obtener la fecha 
 * y hora actuales.
 *
 * @author John Ortiz Ordoñez
 */
public class FechaHoraActuales {

    public static void main(String[] args) {
        
        LocalDateTime fechaHoraActuales = LocalDateTime.now();
        System.out.println("Fecha y hora actuales: " + fechaHoraActuales);
    }
}
