package ejercicio0000570;

/**
 * Ejercicio 570: Determinar si un número dado es palindromo o no a través de una función.
 *
 * @author John Ortiz Ordoñez.
 */
public class NumeroCapicua {

    public static void main(String[] args) {
        
        System.out.println(esPalindromo(1001)); // true
        System.out.println(esPalindromo(12321)); // true
        System.out.println(esPalindromo(12371)); // false
        
        System.out.println();
        
        System.out.println(esPalindromo(-8888)); // false
    }
    
    public static boolean esPalindromo(int numero) {
        String numeroTexto = String.valueOf(numero);
        
        int i = 0;
        int j = numeroTexto.length() - 1;
        
        while (i < j) {
            if (numeroTexto.charAt(i) != numeroTexto.charAt(j)) {
                return false;
            }
            
            ++i;
            --j;
        }
        
        return true;
    }
}
