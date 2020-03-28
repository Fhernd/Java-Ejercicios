package ejercicio0000100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Ejercicio 100: Uso de colecciones genéricas.
 * 
 * @author John Ortiz Ordoñez
 */
public class ColeccionesGenericas {

    public static void main(String[] args) {
        
        // ArrayList:
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(new Double("5.3"));
        numeros.add(new Double("7.3"));
        numeros.add(new Double("8.3"));
        
        // HashMap:
        HashMap<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "Notepad++");
        nombres.put(2, "Visual Studio Code");
        nombres.put(3, "NetBeans IDE");
        
        // HashSet:
        HashSet<Integer> numerosEnteros = new HashSet<>();
        numerosEnteros.add(5);
        numerosEnteros.add(7);
        numerosEnteros.add(9);
        numerosEnteros.add(7);
    }
}
