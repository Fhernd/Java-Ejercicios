package ejercicio0000241;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Ejercicio 241: Formatear una fecha respecto a la región del sistema o 
 * establecida.
 * 
 * @author John Ortiz Ordoñez
 */
public class FormatoFecha {

    public static void main(String[] args) {
        
        Date ahora = new Date();
        
        Locale region = Locale.getDefault();
        DateFormat formatoFecha = DateFormat.getDateInstance(DateFormat.FULL,
                region);
        
        System.out.println("Región: " + region.getDisplayName());
        System.out.println("Fecha regional: " + formatoFecha.format(ahora));
        
        System.out.println();
        
        region = Locale.GERMANY;
        formatoFecha = DateFormat.getDateInstance(DateFormat.FULL, region);
        
        System.out.println("Región: " + region.getDisplayName());
        System.out.println("Fecha regional: " + formatoFecha.format(ahora));
    }
}
