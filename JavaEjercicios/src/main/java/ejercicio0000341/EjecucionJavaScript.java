package ejercicio0000341;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Ejercicio 341: Ejecutar código JavaScript desde Java con ScriptEngineManager.
 * 
 * @author John Ortiz Ordoñez
 */
public class EjecucionJavaScript {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        
        final String LENGUAJE = "ECMAScript";
        
        ScriptEngine engine = scriptEngineManager.getEngineByName(LENGUAJE);
        
        if (engine == null){
            System.out.println("MENSAJE: No se ha podido encontrar el motor " + LENGUAJE);
            return;
        }
        
        engine.eval("var a = 2;");
        engine.eval("var b = 3;");
        engine.eval("var suma = a + b;");
        engine.eval("print(suma);");
    }
}
