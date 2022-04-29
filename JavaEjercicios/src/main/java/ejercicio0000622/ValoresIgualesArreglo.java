package ejercicio0000622;

/**
 * Ejercicio 622: Comprobar si el primer y último elementos de un arreglo son iguales.
 *
 * @author: John Ortiz Ordoñez
 */
public class ValoresIgualesArreglo {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 5, 7, 2};
        System.out.println(primerUltimoElementosIguales(numeros));  // true

        System.out.println();

        int[] otrosNumeros = {3, 5, 11, 19, 23};
        System.out.println(primerUltimoElementosIguales(otrosNumeros)); // false
    }

    public static boolean primerUltimoElementosIguales(int[] numeros) {
        return numeros[0] == numeros[numeros.length - 1];
    }
}
