package ejercicio0000575;

/**
 * Ejercicio 575: Crear una función para buscar un valor en una matriz de dimensión nxm.
 *
 * @author John Ortiz Ordoñez.
 */
public class BusquedaValorMatriz {

    public static void main(String[] args) {
        
        int[][] numeros = {
            {3, 11, 13},
            {2, 5, 17},
            {23, 29, 17},
            {7, 2, 31}
        };
        
        int numero = 5;
        
        System.out.println(buscarValor(numeros, numero));   // true
        
        System.out.println();
        
        numero = 61;
        System.out.println(buscarValor(numeros, numero));   // false
    }
    
    public static boolean buscarValor(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
