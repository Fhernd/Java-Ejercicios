package ejercicio0000420;

import java.time.LocalDateTime;

/**
 * Ejercicio 420: Realizar operaciones artiméticas sobre una fecha y hora 
 * (LocalDateTime).
 *
 * @author John Ortiz Ordoñez
 */
public class AritmeticaFechaHora {

    public static void main(String[] args) {
        
        LocalDateTime fechaHoraActuales = LocalDateTime.now();
        System.out.println(fechaHoraActuales);
        
        System.out.println();
        
        LocalDateTime resultado = fechaHoraActuales.minusMonths(11);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = fechaHoraActuales.minusMonths(123);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = fechaHoraActuales.plusMinutes(83000);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = fechaHoraActuales.plusWeeks(323);
        System.out.println(resultado);
    }
}
