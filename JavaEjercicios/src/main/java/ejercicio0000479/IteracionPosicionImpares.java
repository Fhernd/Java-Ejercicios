package ejercicio0000479;

/**
 * Ejercicio 479: Iterar con un ciclo for las posiciones impares de un
 * arreglo.
 *
 * @author John Ortiz Ordoñez
 */
public class IteracionPosicionImpares {

    public static void main(String[] args) {
        
        int numeros[] = new int[20];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println();
        System.out.println();
        
        for(int i = 1; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }
    }
}
