package ejercicio0000574;

/**
 * Ejercicio 574: Encontrar el índice de la primera ocurrencia de un elemento en un arreglo dado.
 *
 * @author John Ortiz Ordoñez.
 */
public class BusquedaIndice {

    public static void main(String[] args) {
        
        int[] primos = {2, 3, 5, 7, 11};
        int numero = 5;
        
        System.out.println(encontrarIndice(primos, numero)); // 2
        
        System.out.println();
        
        numero = 13;
        System.out.println(encontrarIndice(primos, numero)); // -1
    }
    
    public static int encontrarIndice(int[] numeros, int numero) {
        int indiceInferior = 0;
        int indiceSuperior = numeros.length - 1;
        
        while (indiceInferior <= indiceSuperior) {
            int mitad = (indiceInferior + indiceSuperior) >> 1;
            
            if (numeros[mitad] == numero) {
                return mitad;
            }
            
            if (numeros[mitad] >= numero) {
                indiceSuperior = mitad - 1;
            } else {
                indiceInferior = mitad + 1;
            }
        }
        
        return -1;
    }
}
