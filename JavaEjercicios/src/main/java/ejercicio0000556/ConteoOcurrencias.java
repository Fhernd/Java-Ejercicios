package ejercicio0000556;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio 556: Contar las ocurrencias de valores en un arreglo con un objeto Map.
 *
 * @author John Ortiz Ordoñez.
 */
public class ConteoOcurrencias {

    public static void main(String[] args) {
        
        int[] numeros = {2, 5, 7, 5, 13, 11, 5, 2, 2, 5, 19, 17, 7, 7, 7, 5, 13};
        System.out.println(Arrays.toString(numeros));
        
        System.out.println();
        
        Map<Integer, Integer> conteo = new HashMap<>();
        
        for (int n : numeros) {
            if (conteo.containsKey(n)) {
                conteo.put(n, conteo.get(n) + 1);
            } else {
                conteo.put(n, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> ocurrencia : conteo.entrySet()) {
            System.out.printf("%d -> %d%n", ocurrencia.getKey(), ocurrencia.getValue());
        }
    }
}
