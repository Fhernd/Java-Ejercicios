package ejercicio0000240;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * Ejercicio 240: Formatear un valor númerico como moneda usando una región.
 * 
 * @author John Ortiz Ordoñez
 */
public class FormatoMonedas {

    public static void main(String[] args) {
        
        Double valor = new Double("987654321.999");
        Locale region = Locale.getDefault();
        Currency moneda = Currency.getInstance(region);
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(region);
        
        System.out.println("Región: " + region.getDisplayName());
        System.out.println("Moneda: " + moneda.getDisplayName());
        System.out.println("Valor: " + formatoMoneda.format(valor));
        
        System.out.println();
        
        region = Locale.GERMANY;
        moneda = Currency.getInstance(region);
        formatoMoneda = NumberFormat.getCurrencyInstance(region);
        
        System.out.println("Región: " + region.getDisplayName());
        System.out.println("Moneda: " + moneda.getDisplayName());
        System.out.println("Valor: " + formatoMoneda.format(valor));
    }
}
