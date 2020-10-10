package ejercicio0000400;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Ejercicio 400: Formatear valores de punto flotante en cadenas que 
 * representen monedas.
 *
 * @author John Ortiz Ordoñez
 */
public class FormatoMoneda {

    public static void main(String[] args) {
        
        // 319.47 => $319.47
        
        double precio = 319.47;
        
        String resultado = formatearReal(precio);
        
        System.out.println(precio);
        System.out.println(resultado);
    }
    
    public static String formatearReal(double numero) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.UK);
        
        return formato.format(numero);
    }
}
