package ejercicio0000261;

import java.util.function.BiFunction;

/**
 * Ejercicio 261: Concatenar dos cadenas de caracteres usando programación funcional.
 *  
 * @author John Ortiz Ordoñez
 */
public class Concatenacion {

    public static void main(String[] args) {
        
        BiFunction<String, String, String> concatenar = (a, b) -> a + b;
        
        String resultado = concatenar.apply("Java ", "8");
        
        System.out.println(resultado);
    }
}
