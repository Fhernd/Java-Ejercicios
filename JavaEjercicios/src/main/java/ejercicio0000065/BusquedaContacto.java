package ejercicio0000065;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 65: Encontrar números de teléfono o números de celular 
 * por medio una expresión regular.
 * 
 * @author John Ortiz Ordoñez
 */
public class BusquedaContacto {
    public static void main(String[] args) {
        String texto = "Contacto: 3112233344 - Contacto: 7100222 - Contacto: 3001223334 - Contacto: 320 8884444 - Contacto: 7244221 - Contacto: 71 12345";
        
        String patron = "(\\d{10}|\\d{7}|\\d{3} \\d{7}|\\d{2} \\d{5})";
        
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
