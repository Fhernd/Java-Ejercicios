package ejercicio0000373;

/**
 * Ejercicio 373: Usar la función compareTo() para comparar cadenas de 
 * caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionNumerica {

    public static void main(String[] args) {
        
        String lenguaje1 = "Java";
        String lenguaje2 = "java";
        
        int resultado = lenguaje1.compareTo(lenguaje2);
        System.out.println(resultado);
        
        System.out.println();
        
        resultado = lenguaje2.compareTo(lenguaje1);
        System.out.println(resultado);
        
        System.out.println();
        
        lenguaje2 = "Java";
        
        resultado = lenguaje1.compareTo(lenguaje2);
        System.out.println(resultado);
    }
}
