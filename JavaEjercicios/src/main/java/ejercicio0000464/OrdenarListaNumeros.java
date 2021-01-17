package ejercicio0000464;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 464: Ordenar una lista de números (ArrayList) utilizando una expresión 
 * lambda.
 * 
 * @author John Ortiz Ordoñez
 */
public class OrdenarListaNumeros {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(7);
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        numeros.add(13);
        numeros.add(11);
        
        numeros.forEach(System.out::println);
        
        System.out.println();
        
        Comparator<Integer> comparador = (x, y) -> Integer.compare(x, y);
        
        numeros.sort(comparador);
        
        numeros.forEach(System.out::println);
    }
}
