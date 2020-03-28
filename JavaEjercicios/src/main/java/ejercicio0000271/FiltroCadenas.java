package ejercicio0000271;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Ejercicio 271: Crear un filtro para obtener objetos Strings que cumplan
 * una condición.
 * 
 * @author John Ortiz Ordoñez
 */
public class FiltroCadenas {

    public static void main(String[] args) {
        
        List<String> paises = Arrays.asList("Rusia", "Argentina", "Colombia",
                "Ecuador", "Cuba", "Canadá", "Bolivia", "Perú");
        
        Predicate<String> iniciaConC = s -> s.startsWith("C");
        
        paises.stream().filter(iniciaConC)
                .forEach(s -> System.out.println("País: " + s));
    }
}
