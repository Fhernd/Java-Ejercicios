package ejercicio0000395;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Ejercicio 395: Usar el método static getInstance() para formatear valores 
 * numéricos.
 *
 * @author John Ortiz Ordoñez
 */
public class FormatoNumeros {

    public static void main(String[] args) {
        
        NumberFormat formatoNumeros = NumberFormat.getInstance();
        
        String resultado = formatoNumeros.format(123.45678);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = NumberFormat.getInstance(Locale.ITALY).format(123.45678);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = NumberFormat.getInstance(Locale.FRANCE).format(123.45678);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = NumberFormat.getInstance(Locale.GERMAN).format(123.45678);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = NumberFormat.getInstance(Locale.US).format(123.45678);
        System.out.println(resultado);
    }
}
