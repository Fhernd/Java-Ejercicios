package ejercicio0000059;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 59: Reemplazar texto a través de una expresión regular.
 * 
 * @author John Ortiz Ordoñez
 */
public class ModificacionTexto {
    public static void main(String[] args) {

        String texto = "Con java se puede aprender a programar. La versión 12 de java es la más reciente. java 8 es la versión más usada.";
        
        String patron = "\\bjava\\b";
        
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println(matcher.replaceAll("Java"));
    }
}
