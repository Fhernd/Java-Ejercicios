package ejercicio0000534;

import java.util.Collections;
/**
 * Ejercicio 534: Sustituir los últimos n caracteres de un texto por un carácter específico.
 *
 * @author John Ortiz Ordoñez
 */
public class SustitucionUltimosCaracteres {

    public static void main(String[] args) {
        
        // Programación
        // #
        // 3
        // => Programac###
        
        System.out.println(sustuirUltimosCaracteres("Programación", "#", 3)); // Programac###
        
        System.out.println();
        
        System.out.println(sustuirUltimosCaracteres("Programación", "#", 20)); // ############
    }
    
    public static String sustuirUltimosCaracteres(String texto, String caracter, int n) {
        if (n > texto.length()) {
            n = texto.length();
        }
        
        return texto.substring(0, texto.length() - n) + String.join("", Collections.nCopies(n, caracter));
    }
}
