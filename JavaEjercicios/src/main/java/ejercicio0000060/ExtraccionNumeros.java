package ejercicio0000060;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 60: Extraer sólo los números de un texto.
 * 
 * @author John Ortiz Ordoñez
 */
public class ExtraccionNumeros {
    public static void main(String[] args) {
        String texto = "Java 8. Java 9. Java 10. Java 11.";
        
        String patron = "\\d+";
        
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
