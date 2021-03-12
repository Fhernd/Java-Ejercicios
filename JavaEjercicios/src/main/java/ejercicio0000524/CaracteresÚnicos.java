package ejercicio0000524;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Ejercicio 524: Usar un conjunto para obtener los caracteres únicos de un texto.
 *
 * @author John Ortiz Ordoñez
 */
public class CaracteresÚnicos {

    public static void main(String[] args) {
        
        String texto = "matemáticas";
        System.out.println(texto);
        
        System.out.println();
        
        String[] caracteres = texto.split("");
        System.out.println(caracteres.length);
        
        System.out.println();
        
        Set<String> caracteresUnicos = new HashSet<>(Arrays.asList(caracteres));
        System.out.println(caracteresUnicos.size());
        
        System.out.println();
        
        for (String caracteresUnico : caracteresUnicos) {
            System.out.println(caracteresUnico);
        }
    }
}
