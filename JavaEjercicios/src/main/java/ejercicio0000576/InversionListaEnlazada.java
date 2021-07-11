package ejercicio0000576;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 576: Invertir una lista ArrayList con la función reverse() de Collections.
 *
 * @author John Ortiz Ordoñez.
 */
public class InversionListaEnlazada {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(11);
        
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println();
        
        Collections.reverse(numeros);
        
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
