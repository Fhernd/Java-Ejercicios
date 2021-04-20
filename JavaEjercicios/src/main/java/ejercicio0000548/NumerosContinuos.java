package ejercicio0000548;

/**
 * Ejercicio 548: Definir una función para validar si un arreglo tiene dos valores iguales contiguos.
 *
 * @author John Ortiz Ordoñez.
 */
public class NumerosContinuos {

    public static void main(String[] args) {
        
        // [5, 7, 11, 13, 13, 5, 2, 2]
        
        int[] numeros = {5, 7, 11, 13, 13, 5, 2, 2};
        System.out.println(hayValoresIgualesContiguos(numeros));    // true
        
        System.out.println();
        
        numeros = new int[]{5, 7, 11, 13, 17, 5, 2, 2};
        System.out.println(hayValoresIgualesContiguos(numeros));    // true
        
        System.out.println();
        
        numeros = new int[]{5, 7, 11, 13, 17, 5, 2, 19};
        System.out.println(hayValoresIgualesContiguos(numeros));    // false
    }
    
    public static boolean hayValoresIgualesContiguos(int[] numeros) {
        for(int i = 0; i < numeros.length - 1; ++i) {
            if (numeros[i] == numeros[i + 1]) {
                return true;
            }
        }
        
        return false;
    }
}
