package ejercicio0000386;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 386: Usar una expresión regular para encontrar coincidencias 
 * de texto.
 *
 * @author John Ortiz Ordoñez
 */
public class BusquedaTextoRegex {

    public static void main(String[] args) {
        
        String frase = "Java 9";
        
        Pattern patron = Pattern.compile("Java [0-9]");
        Matcher matcher = patron.matcher(frase);
        boolean resultado = matcher.matches();
        System.out.println(resultado);  // true
        
        System.out.println();
        
        frase = "Java 14";
        matcher = patron.matcher(frase);
        resultado = matcher.matches();
        System.out.println(resultado);  // false
        
        System.out.println();
        
        patron = Pattern.compile("Java [0-9]+");
        matcher = patron.matcher(frase);
        resultado = matcher.matches();
        System.out.println(resultado);  // true
    }
}
