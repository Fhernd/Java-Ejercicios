package ejercicio0000621;

/**
 * Ejercicio 621: Validar si un valor aparece al inicio y al final de un arreglo.
 *
 * @author: John Ortiz Ordoñez
 */
public class ValorInicioFinExiste {
    public static void main(String[] args) {
        int[] primos = {11, 17, 19, 7, 23, 11};

        System.out.println(existeValorAlInicioFinal(primos, 11));   // true
        System.out.println(existeValorAlInicioFinal(primos, 17));   // false

        System.out.println();

        int[] otrosPrimos = {13, 5, 7, 2, 29};
        System.out.println(existeValorAlInicioFinal(otrosPrimos, 13));  // false
    }

    public static boolean existeValorAlInicioFinal(int[] numeros, int numero) {
        return numeros[0] == numero && numeros[numeros.length - 1] == numero;
    }
}
