package ejercicio0000062;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 62: Evaluar una expresión regular sin considerar 
 * minúsculas y mayúsculas.
 * 
 * @author John Ortiz Ordoñez
 */
public class SustitucionTexto {
    public static void main(String[] args) {
        String texto = "Con jaVa se puede aprender a programar. La versión 12 de JAVA es la más reciente. jAvA 8 es la versión más usada.";
        
        String patron = "\\bjava\\b";
        
        Pattern pattern = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println(matcher.replaceAll("Java"));
    }
}
