package ejercicio0000235;

import java.util.Locale;

/**
 * Ejercicio 235: Obtener la lista de sitios o locales disponibles en el 
 * sistema con la clase Locale.
 * 
 * @author John Ortiz Ordoñez
 */
public class SitiosDisponibles {

    public static void main(String[] args) {
        
        Locale[] localesDisponibles = Locale.getAvailableLocales();
        
        for (Locale locale : localesDisponibles) {
            System.out.println(locale);
        }
    }
}
