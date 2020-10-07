package ejercicio0000396;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Ejercicio 396: Usar el método parse() para convertir una cadena a un número.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionNumeros {

    public static void main(String[] args) {

        try {
            NumberFormat formato = NumberFormat.getInstance();

            String cadena = "123.45678";

            Number numero = formato.parse(cadena);
            
            System.out.println(numero); // 123.45678
            
            System.out.println(numero.intValue());  // 123
            
            double valorReal = numero.doubleValue();
            
            System.out.println(valorReal);
        } catch (ParseException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
