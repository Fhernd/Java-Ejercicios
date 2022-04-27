package ejercicio0000610;

/**
 * Ejercicio 610: Calcular la suma de los primeros 100 números primos.
 *
 * @author: John Ortiz Ordoñez
 */
public class SumaPrimeros100Primos {
    public static void main(String[] args) {
        System.out.printf("La suma de los primeros 100 números primos es igual a %d\n", calcularSumaPrimeros100Primos());
    }

    public static int calcularSumaPrimeros100Primos() {
        int sumaPrimos = 2;
        int contador = 0;
        int numero = 2;

        while (contador < 100) {
            ++numero;

            if (numero % 2 != 0) {
                if (esPrimo(numero)) {
                    sumaPrimos += numero;
                    ++contador;
                }
            }
        }

        return sumaPrimos;
    }

    public static boolean esPrimo(int numero) {
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
