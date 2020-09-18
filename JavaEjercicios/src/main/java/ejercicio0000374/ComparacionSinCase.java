package ejercicio0000374;

/**
 *  Ejercicio 374: Usar el método compareToIgnoreCase() para comparar cadenas 
 * de caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionSinCase {

    public static void main(String[] args) {
        
        String lenguaje1 = "Java";
        String lenguaje2 = "java";
        
        System.out.println(lenguaje1.compareTo(lenguaje2));     // -
        
        System.out.println();
        
        System.out.println(lenguaje1.compareToIgnoreCase(lenguaje2));   // 0
        
        System.out.println(lenguaje2.compareToIgnoreCase(lenguaje1));   // 0
    }
}
