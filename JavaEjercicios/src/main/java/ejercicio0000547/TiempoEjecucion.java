package ejercicio0000547;

/**
 * Ejercicio 547: Computar el tiempo de ejecución de una función con el método static nanoTime().
 *
 * @author John Ortiz Ordoñez.
 */
public class TiempoEjecucion {
    
    public static void main(String[] args) {
        for(int i = 1; i <= 50; ++i) {
            long inicio = System.nanoTime();
            
            long resultado = fibonacci(i);
            
            long fin = System.nanoTime();
            
            long tiempoTotal = fin - inicio;
            
            System.out.printf("El cálculo de fibonacci(%d) tomó %d\n", i, tiempoTotal);
            System.out.println();
        }
    }
    
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
