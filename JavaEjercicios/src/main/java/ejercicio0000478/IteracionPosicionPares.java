package ejercicio0000478;

/**
 * Ejercicio 478: Iterar con un ciclo for las posiciones pares de un arreglo.
 *
 * @author John Ortiz Ordoñez
 */
public class IteracionPosicionPares {

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
        
        for(int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }
    }
}
