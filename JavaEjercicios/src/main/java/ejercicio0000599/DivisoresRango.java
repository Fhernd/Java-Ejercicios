package ejercicio0000599;

/**
 * Ejercicio 599: Contar la cantidad de divisores de un número dado en un rango específico.
 *
 * @author John Ortiz Ordoñez.
 */
public class DivisoresRango {

    public static void main(String[] args) {
        System.out.println(contarDivisores(1, 20, 3));  // 2
        System.out.println(contarDivisores(1, 20, 5));  // 2
        System.out.println(contarDivisores(1, 20, 20));  // 5
    }

    public static int contarDivisores(int inicio, int finalRango, int numero) {
        int contador = 0;

        for (int i = inicio; i <= finalRango; ++i) {
            if (numero % i == 0) {
                ++contador;
            }
        }

        return contador;
    }
}
