package ejercicio0000064;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 64: Encontrar fechas con un formato especificado usando 
 * expresiones regulares.
 * 
 * @author John Ortiz Ordoñez
 */
public class BusquedaFechas {
    public static void main(String[] args) {
        String texto = "Registro 1: 1999/04/19 - Registro 2: 1984.05.21 - Registro 3: 12/03/2017 - Registro 4: 1990-1-1 - Registro 5: 2019 04 13 - Registro 6: 08/10/1984 - Registro 7: 08/08/01 - Registro 8: 31.12-2014 - Registro 9: 1964-02-21";
        
        // Formatos permitidos: aaaa-mm-dd, aaaa mm dd, aaaa.mm.dd,
        // aaaa/mm/dd
        // Restricciones: Para la cadena aaaa sólo siglo XX y XXI
        
        String patron = "\\b(19|20)[0-9]{2}[- ./](0[1-9]|1[012])[- ./](0[1-9]|[12][0-9]|3[01])\\b";
        
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
