package ejercicio0000355;

import java.util.Map;

/**
 * Ejercicio 355: Obtener todas las variables de entorno con la función 
 * System.getenv();
 *
 * @author John Ortiz Ordoñez
 */
public class VariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> variablesEntorno = System.getenv();
        
        for (String llave : variablesEntorno.keySet()) {
            System.out.printf("%s: %s", llave, variablesEntorno.get(llave));
        }
        
        System.out.println();
        
        System.out.println(System.getenv("PATH"));
    }
}
