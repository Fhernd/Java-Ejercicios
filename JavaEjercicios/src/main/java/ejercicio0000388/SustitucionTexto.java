package ejercicio0000388;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Ejercicio 388: Usar una expresión regular para sustituir una cadena de 
 * caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class SustitucionTexto {

    public static void main(String[] args) {
        
        String frase = "¡Java 8 es tremendo! Hay muchas características relevantes en la versión 8 de este lenguaje de programación.";
        
        Pattern patron = Pattern.compile("[0-9]");
        Matcher matcher = patron.matcher(frase);
        
        System.out.println(frase);
        
        System.out.println();
        
        String resultado = matcher.replaceAll("9");
        System.out.println(resultado);
    }
}
