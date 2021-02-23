package ejercicio0000507;

/**
 * Ejercicio 507: Contar la cantidad de números de tres cifras únicos que se generar con los valores 1, 2, 3 y 4.
 *
 * @author John Ortiz Ordoñez
 */
public class NumerosUnicos3Digitos {

    public static void main(String[] args) {

        // 123
        // 132
        // 421
        // 142
        System.out.println(contarNumeros());    // 24
    }

    public static int contarNumeros() {
        int contador = 0;

        for (int i = 1; i <= 4; ++i) {
            for (int j = 1; j <= 4; ++j) {
                for (int k = 1; k <= 4; ++k) {
                    if (i != k && k != j && i != j) {
                        ++contador;
                    }
                }
            }
        }
        
        return contador;
    }
}
