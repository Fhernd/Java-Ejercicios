package ejercicio0000435;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Ejercicio 435: Formatear para presentación una fecha (LocalDateTime) con 
 * DateTimeFormatter.
 *
 * @author John Ortiz Ordoñez
 */
public class FormatoFechaHora {

    public static void main(String[] args) {
        
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println(fechaHoraActual);
        
        System.out.println();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        String resultado = formato.format(fechaHoraActual);
        
        System.out.println(resultado);
        
        System.out.println();
        
        formato = DateTimeFormatter.ofPattern("yyyy dd MMMM, HH:mm");
        resultado = formato.format(fechaHoraActual);
        System.out.println(resultado);
    }
}
