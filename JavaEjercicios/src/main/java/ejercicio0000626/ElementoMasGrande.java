package ejercicio0000626;

/**
 * Ejercicio 626: Encontrar el elemento más grande entre los valores primero, medio y último de un arreglo.
 *
 * @author: John Ortiz Ordoñez
 */
public class ElementoMasGrande {
    public static void main(String[] args) {
        int[] primos = {19, 17, 23, 2, 7, 5, 11};

        System.out.println(encontrarElementoMasGrande(primos)); // 19

        System.out.println();

        int[] enteros = {2, 17, 23, 5, 7, 5, 3};

        System.out.println(encontrarElementoMasGrande(enteros)); // 5

        System.out.println();

        int[] enterosMas = {2, 17, 23, 3, 7, 5, 5};

        System.out.println(encontrarElementoMasGrande(enteros)); // 5
    }

    public static int encontrarElementoMasGrande(int[] numeros) {
        int primerNumero = numeros[0];
        int mitadNumero = numeros[numeros.length / 2];
        int ultimoNumero = numeros[numeros.length - 1];

        int[] valores = {primerNumero, mitadNumero, ultimoNumero};

        int mayor = primerNumero;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }

        return mayor;
    }
}
