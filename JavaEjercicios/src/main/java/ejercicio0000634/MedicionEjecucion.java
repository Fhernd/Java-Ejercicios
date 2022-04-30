package ejercicio0000634;

/**
 * Ejercicio 634: Computar el tiempo de ejecución de un código la función nanoTime().
 *
 * @author: John Ortiz Ordoñez
 */
public class MedicionEjecucion {
    public static long calcularFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        long inicioEjecucion = System.nanoTime();

        for (int i = 1; i <= 30; i++) {
            System.out.println(calcularFibonacci(i));
        }

        long finEjecucion = System.nanoTime();

        System.out.println(finEjecucion - inicioEjecucion);
    }
}
