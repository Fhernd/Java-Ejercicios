package ejercicio0000372;

/**
 * Ejercicio 372: Usar el método equalsIgnoreCase() para comparar cadenas de 
 * caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionCadenas {

    public static void main(String[] args) {
        
        String lenguaje1 = "Java";
        String lenguaje2 = "java";
        
        System.out.println(lenguaje1.equals(lenguaje2));    // false
        
        System.out.println();
        
        System.out.println(lenguaje1.equalsIgnoreCase(lenguaje2));  // true
        
        System.out.println();
        
        System.out.println(lenguaje1.equalsIgnoreCase(" java"));    // false
    }
}
