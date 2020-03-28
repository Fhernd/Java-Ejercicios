package ejercicio0000242;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Ejercicio 242: Cambiar la región o locale por medio de Locale.setDefault.
 * 
 * @author John Ortiz Ordoñez
 */
public class CambioLocale {

    public static void main(String[] args) {
        
        VerDatosLocale(Locale.getDefault());
        
        System.out.println();
        
        Locale locale = new Locale("en", "US");
        Locale.setDefault(locale);
        
        VerDatosLocale(Locale.getDefault());
    }
    
    public static void VerDatosLocale(Locale locale){
        System.out.println("Región: " + locale.getDisplayName());
        
        DateFormat df = DateFormat.getDateInstance();
        NumberFormat nf = NumberFormat.getInstance();
        
        System.out.println("Fecha: " + df.format(new Date()));
        System.out.println("Número: " + nf.format(987.6543));
    }
}
