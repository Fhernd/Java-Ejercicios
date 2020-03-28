package ejercicio0000025;

import java.util.Map;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class VariablesEntorno {
    public static void main(String[] args){
        Map<String, String> variablesEntorno = System.getenv();
        
        for (String variableEntorno : variablesEntorno.keySet()) {
            System.out.printf("%s: %s", variableEntorno, variablesEntorno.get(variableEntorno));
        }
    } 
}
