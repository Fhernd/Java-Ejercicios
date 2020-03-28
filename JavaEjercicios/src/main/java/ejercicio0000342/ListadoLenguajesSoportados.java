package ejercicio0000342;

import javax.script.ScriptEngineManager;

/**
 * Ejercicio 342: Mostrar el listado de lenguajes de scripting configurados en el classpath.
 * 
 * @author John Ortiz Ordoñez
 */
public class ListadoLenguajesSoportados {
    
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        
        scriptEngineManager.getEngineFactories().forEach(factory -> System.out.println(factory.getLanguageName()));
    }
}
