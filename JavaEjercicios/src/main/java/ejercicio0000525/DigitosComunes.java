package ejercicio0000525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Ejercicio 525: Definir una función para validar si existen dígitos comunes entre dos números enteros.
 *
 * @author John Ortiz Ordoñez
 */
public class DigitosComunes {

    public static void main(String[] args) {
        
        System.out.println(existenDigitosComunes(123, 573));    // true
        System.out.println(existenDigitosComunes(123, 578));    // false
    }
    
    public static boolean existenDigitosComunes(int numero1, int numero2) {
        Set<String> conjuntoDigitosNumero1 = new HashSet<>(Arrays.asList(String.valueOf(numero1).split("")));
        Set<String> conjuntoDigitosNumero2 = new HashSet<>(Arrays.asList(String.valueOf(numero2).split("")));
        
        conjuntoDigitosNumero1.retainAll(conjuntoDigitosNumero2);
        
        return !conjuntoDigitosNumero1.isEmpty();
    }
}
