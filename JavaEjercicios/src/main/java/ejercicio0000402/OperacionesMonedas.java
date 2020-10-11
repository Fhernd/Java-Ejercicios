package ejercicio0000402;

import java.util.Locale;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.AmountFormatQuery;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import org.javamoney.moneta.Money;



/**
 * Ejercicio 402: Realizar la suma de valores tipo moneda con la 
 * Java Money API.
 *
 * @author John Ortiz Ordoñez
 */
public class OperacionesMonedas {

    public static void main(String[] args) {
        
        MonetaryAmount cantidad1 = Money.of(13.17, Monetary.getCurrency("USD"));
        MonetaryAmount cantidad2 = Money.of(20.99, Monetary.getCurrency("USD"));
        MonetaryAmount cantidad3 = Money.of(99.99, Monetary.getCurrency("USD"));
        
        MonetaryAmount cantidadSuma;
        cantidadSuma = cantidad1.add(cantidad2).add(cantidad3);
        
        System.out.println(cantidadSuma);
        
        System.out.println();
        
        MonetaryAmountFormat formato = MonetaryFormats.getAmountFormat(AmountFormatQuery.of(Locale.US));
        
        System.out.println(formato.format(cantidadSuma));
    }
}
