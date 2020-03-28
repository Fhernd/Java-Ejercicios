package ejercicio0000269;

import java.util.function.Predicate;

/**
 * Ejercicio 269: Crear un predicado compuesto para evaluar dos 
 * condiciones.
 * 
 * @author John Ortiz Ordoñez
 */
public class PredicadoCompuesto {
    
    public static void main(String[] args) {
        
        Predicate<String> longitudMenorA10 = s -> s.length() < 10;
        
        Predicate<String> iniciaConJ = s -> s.toLowerCase().startsWith("j");
        
        Predicate<String> longitudMenorA10EIniciaConJ = 
                longitudMenorA10.and(iniciaConJ);
        
        String frase = "Java 8";
        
        System.out.println(longitudMenorA10EIniciaConJ.test(frase));
        
        frase = "Java 8 provee soporte para programación funcional.";
        
        System.out.println(longitudMenorA10EIniciaConJ.test(frase));
    }
}
