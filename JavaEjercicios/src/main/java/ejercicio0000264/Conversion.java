package ejercicio0000264;

import java.util.function.DoubleFunction;

/**
 * Ejercicio 264: Convertir un número real a una cadena de caracteres.
 * 
 * @author John Ortiz Ordoñez
 */
public class Conversion {

    public static void main(String[] args) {
        
        DoubleFunction<String> convertirRealACadena = numero -> Double.toString(numero);
        
        final Double real = Math.PI;
        
        String resultado = convertirRealACadena.apply(real);
        
        System.out.println(resultado);
    }
}
