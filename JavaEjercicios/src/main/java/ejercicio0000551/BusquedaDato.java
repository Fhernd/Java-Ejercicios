package ejercicio0000551;

/**
 * Ejercicio 551: Definir una función para determinar si un dato está dos posiciones adelante en un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class BusquedaDato {

    public static void main(String[] args) {
        
        // [3, 7, 5, 11, 5, 17, 19]
        // numero = 5
        // => true
        
        int[] numeros = {3, 7, 5, 11, 5, 17, 19, 7};
        System.out.println(buscarDatoPosicion(numeros, 5)); // true
        System.out.println(buscarDatoPosicion(numeros, 7)); // false
    }
    
    public static boolean buscarDatoPosicion(int[] numeros, int numero) {
        for (int i = 0; i < numeros.length - 2; i++) {
            if (numeros[i] == numero && numeros[i + 2] == numero) {
                return true;
            }
        }
        
        return false;
    }
}
