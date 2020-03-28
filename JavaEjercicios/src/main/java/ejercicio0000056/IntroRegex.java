package ejercicio0000056;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 56: Escribir un patrón para encontrar palabras de 
 * una longitud arbitraria.
 * 
 * @author John Ortiz Ordoñez
 */
public class IntroRegex {
    public static void main(String[] args){
        String texto = "Este es un ejemplo de una expresion RegEx.";
        
        String cadenaPatron = "\\b[a-zA-Z]{2}\\b";
        
        Pattern patron = Pattern.compile(cadenaPatron);
        Matcher matcher = patron.matcher(texto);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
