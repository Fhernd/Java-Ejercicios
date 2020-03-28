package ejercicio0000063;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 63: Encontrar números decimales con una expresión 
 * regular.
 * 
 * @author John Ortiz Ordoñez
 */
public class BusquedaReales {
    public static void main(String[] args) {
        String texto = "Pi: 3.14159265 - Euler: 2.71828182 - Pitágoras: 1.41421356 - Berstein: 0.28016949";
        
        String patron = "\\d+\\.\\d+";
        
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
