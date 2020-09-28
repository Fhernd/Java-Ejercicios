package ejercicio0000383;

/**
 * Ejercicio 383: Usar el método matches() para buscar coincidencias de texto 
 * con una expresión regular.
 *
 * @author John Ortiz Ordoñez
 */
public class BusquedaTexto {

    public static void main(String[] args) {
        
        String palabra = "Java";
        
        boolean resultado = palabra.matches("Java");
        System.out.println(resultado);  // true
        
        System.out.println();
        
        palabra = "java";
        resultado = palabra.matches("Java");
        System.out.println(resultado);  // false
        
        System.out.println();
        
        resultado = palabra.matches("[Jj]ava");
        System.out.println(resultado);  // true
        
        System.out.println();
        
        palabra = "Python";
        resultado = palabra.matches("[Jj]ava");
        System.out.println(resultado);  // false
        
        System.out.println();
        
        resultado = palabra.matches("[Jj]ava|[Pp]ython");
        System.out.println(resultado);  // true
        
        System.out.println();
        
        palabra = "Java";
        resultado = palabra.matches("[Jj]ava|[Pp]ython");
        System.out.println(resultado);  // true
    }
}
