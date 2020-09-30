package ejercicio0000387;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Ejercicio 387: Comprobar si una cadena de caracteres contiene un número 
 * entero.
 *
 * @author John Ortiz Ordoñez
 */
public class BusquedaNumerosEnteros {

    public static void main(String[] args) {
        String contenido = "123";
        
        Pattern patron = Pattern.compile("[0-9]+");
        Matcher matcher = patron.matcher(contenido);
        boolean resultado = matcher.matches();
        System.out.println(resultado);  // true
        
        System.out.println();
        
        contenido = "123A";
        matcher = patron.matcher(contenido);
        resultado = matcher.matches();
        System.out.println(resultado);  // false
        
        System.out.println();
        
        patron = Pattern.compile(".+[0-9]+.+");
        matcher = patron.matcher(contenido);
        resultado = matcher.matches();
        System.out.println(resultado);  // true
        
        System.out.println();
    }
}
