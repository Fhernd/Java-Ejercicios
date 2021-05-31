package ejercicio0000562;

/**
 * Ejercicio 562: Validar si un arreglo contiene tres números enteros adyacentes consecutivos.
 *
 * @author John Ortiz Ordoñez.
 */
public class ElementosConsecutivosAscendentes {

    public static void main(String[] args) {
        
        // {2, 5, 11, 10, 17, 7, 23, 24, 25}
        
        int[] numeros = {2, 5, 11, 10, 17, 7, 23, 24, 25};
        
        System.out.println(hayElementosEnterosConsecutivosAdyacentes(numeros)); // true
        
        System.out.println();
        
        numeros = new int[]{2, 3, 4, 5, 11, 10, 17, 7, 23, 13, 25};
        
        System.out.println(hayElementosEnterosConsecutivosAdyacentes(numeros)); // true
        
        System.out.println();
        
        numeros = new int[]{2, 31, 4, 5, 11, 10, 17, 7, 23, 13, 25};
        
        System.out.println(hayElementosEnterosConsecutivosAdyacentes(numeros)); // false
    }
    
    public static boolean hayElementosEnterosConsecutivosAdyacentes(int[] numeros) {
        for (int i = 0; i <= numeros.length - 3; i++) {
            if (numeros[i] + 1 == numeros[i + 1] && numeros[i] + 2 == numeros[i + 2]) {
                return true;
            }
        }
        
        return false;
    }
}
