package ejercicio0000055;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/**
 * Ejercicio 55: Usar StringUtils de Apache Commons Lang para 
 * operaciones extra sobre objetos String.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoClaseStringUtils {
    public static void main(String[] args) {
        // Constantes:
        String cadenaVacia = StringUtils.EMPTY;
        
        System.out.println(cadenaVacia);
        
        String espacio = StringUtils.SPACE;
        
        System.out.println("Java" + espacio + "es génial");
        
        String saltoLinea = StringUtils.LF;
        
        System.out.println("Java" + saltoLinea + "es sorprendente");
        
        System.out.println("");
        
        // Abreviación:
        String lenguaje = "Java es un lenguaje programación";
        System.out.println(StringUtils.abbreviate(lenguaje, 7));
        
        System.out.println("");
        
        // Capitalizar:
        lenguaje = "java 8";
        System.out.println(StringUtils.capitalize(lenguaje));
        
        System.out.println("");
        
        // Contar coincidencias:
        lenguaje = "Java es génial. Java es novedoso";
        System.out.println(StringUtils.countMatches(lenguaje, "es"));        System.out.println("");
        
        // Obtener dígitos de una cadena:
        lenguaje = "Java 8. Java 9. Java 11. Java 12";
        System.out.println(StringUtils.getDigits(lenguaje));
        System.out.println("");
        
        // Comparar por apariencia:
        System.out.println(StringUtils.getLevenshteinDistance("jaba", "Java"));
        System.out.println(StringUtils.getFuzzyDistance("Roo", "ROoM", Locale.US));
        
        System.out.println("");
        
        // Preguntar si una cadena sólo contiene espacio vacío:
        System.out.println(StringUtils.isBlank("\t\n\n\t"));
        System.out.println("");
        
        // Alternar capitalización:
        System.out.println(StringUtils.swapCase(lenguaje));
    }
}
