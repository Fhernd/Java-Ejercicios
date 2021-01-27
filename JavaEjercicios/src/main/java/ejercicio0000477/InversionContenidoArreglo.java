package ejercicio0000477;

/**
 * Ejercicio 477: Invertir el contenido de un arreglo usando un ciclo for 
 * con recorrido por índices.
 * 
 * @author John Ortiz Ordoñez
 */
public class InversionContenidoArreglo {

    public static void main(String[] args) {
        
        // [1, 2, 3, 4, 5]
        // [5, 4, 3, 2, 1]
        
        int numeros[] = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println();
        
        int numerosInvertidos[] = new int[numeros.length];
        
        for(int i = numeros.length - 1, j = 0; i >= 0; --i, ++j) {
            numerosInvertidos[j] = numeros[i];
        }
        
        for (int i = 0; i < numerosInvertidos.length; i++) {
            System.out.print(numerosInvertidos[i] + " ");
        }
    }
}
