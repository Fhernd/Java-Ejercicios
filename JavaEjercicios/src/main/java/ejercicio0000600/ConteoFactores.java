package ejercicio0000600;

/**
 * Ejercicio 600: Contar el número de factores de un número en una función.
 *
 * @author John Ortiz Ordoñez.
 */
public class ConteoFactores {

    public static void main(String[] args) {
        System.out.println(contarFactores(5));
        System.out.println(contarFactores(10));
        System.out.println(contarFactores(13));
        System.out.println(contarFactores(16));
    }
    
    public static int contarFactores(int numero) {
        int contadorFactores = 0;
        
        for (int i = 1; i <= Math.sqrt(numero); ++i) {
            if (numero % i == 0 && i * i != numero) {
                contadorFactores += 2;
            } else if (i * i == numero) {
                ++contadorFactores;
            }
        }
        
        return contadorFactores;
    }
}
