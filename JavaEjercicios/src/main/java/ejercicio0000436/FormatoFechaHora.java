package ejercicio0000436;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Ejercicio 436: Especificar un formato personalizado para la fecha y hora con
 * SimpleDateFormat.
 *
 * @author John Ortiz Ordoñez
 */
public class FormatoFechaHora {

    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario);
        
        System.out.println();
        
        SimpleDateFormat formato = new SimpleDateFormat("MMMM dd yyyy");
        String resultado = formato.format(calendario.getTime());
        System.out.println(resultado);
        
        System.out.println();
        
        formato = new SimpleDateFormat("MM/dd/YY HH:mm:ss");
        resultado = formato.format(calendario.getTime());
        System.out.println(resultado);
    }
}
