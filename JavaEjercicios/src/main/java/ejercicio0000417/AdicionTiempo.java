package ejercicio0000417;

import java.time.LocalTime;

/**
 * Ejercicio 417: Adicionar o sustraer tiempo a objetos de tipo LocalTime.
 *
 * @author John Ortiz Ordoñez
 */
public class AdicionTiempo {

    public static void main(String[] args) {
        
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
        
        System.out.println();
        
        horaActual = horaActual.minusHours(2);
        horaActual = horaActual.minusMinutes(10);
        horaActual = horaActual.minusSeconds(20);
        
        System.out.println("Hora: " + horaActual);
        
        System.out.println();
        
        horaActual = horaActual.plusHours(12);
        System.out.println("Hora: " + horaActual);
    }
}
