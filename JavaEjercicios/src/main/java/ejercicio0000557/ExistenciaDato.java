package ejercicio0000557;

import java.util.Arrays;

/**
 * Ejercicio 557: Validar si un arreglo de números contiene uno de dos valores dados.
 *
 * @author John Ortiz Ordoñez.
 */
public class ExistenciaDato {

    public static void main(String[] args) {
        
        int[] numeros = {11, 23, 13, 31, 45, 20, 33, 47};
        
        int numero1 = 31;
        int numero2 = 41;
        
        boolean existe = Arrays.stream(numeros).anyMatch(n -> n == numero1 || n == numero2);
        System.out.println(existe); // true
        
        System.out.println();
        
        int numero3 = 61;
        
        existe = Arrays.stream(numeros).anyMatch(n -> n == numero3 || n == numero2);
        System.out.println(existe); // false
    }
}
