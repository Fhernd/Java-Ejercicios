package ejercicio0000630;

/**
 * Ejercicio 630: Sumar los dígitos de un número entero dentro de una función.
 *
 * @author: John Ortiz Ordoñez
 */
public class SumaDigitosNumero {
    public static void main(String[] args) {
        System.out.println(sumarDigitos(12345));    // 15
        System.out.println(sumarDigitos(235711));    // 19
    }

    public static int sumarDigitos(int numero) {
        int suma = 0;

        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}
