package ejercicio0000533;

import java.util.Collections;

/**
 * Ejercicio 533: Establecer un carácter de reemplazo de n cantidad de caracteres en un texto.
 *
 * @author John Ortiz Ordoñez
 */
public class ReemplazoCaracteres {

    public static void main(String[] args) {
        
        // #
        // Programación
        // n = 3
        // ###gramación
        
        System.out.println(reemplazarCaracters("Programación", "#", 3)); // ###gramación
    }
    
    public static String reemplazarCaracters(String texto, String caracter, int n) {
        if (n > texto.length()) {
            n = texto.length();
        }
        
        return String.join("", Collections.nCopies(n, caracter)) + texto.substring(n);
    }
}
