package ejercicio0000385;

/**
 * Ejercicio 385: Buscar números en una cadena de de caracteres usando una 
 * expresión regular.
 *
 * @author John Ortiz Ordoñez
 */
public class BusquedaNumeros {

    public static void main(String[] args) {
        
        String lenguaje = "Java 8";
        boolean resultado = lenguaje.matches("Java [0-9]");
        System.out.println(resultado);  // true
        
        System.out.println();
        
        lenguaje = "Java 9";
        resultado = lenguaje.matches("Java [0-9]");
        System.out.println(resultado);  // true
        
        System.out.println();
        
        lenguaje = "Java 12";
        resultado = lenguaje.matches("Java [0-9]");
        System.out.println(resultado);  // true
        
        System.out.println();
        
        lenguaje = "Java 12";
        resultado = lenguaje.matches("Java [0-9]+");
        System.out.println(resultado);  // true
    }
}
