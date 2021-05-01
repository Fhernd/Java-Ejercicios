package ejercicio0000552;

/**
 * Ejercicio 552: Validar que un valor dado aparezca n veces en un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class ConteoValidacionValor {

    public static void main(String[] args) {
        
        int[] numeros = {300, 100, 200, 100, 500, 500, 700, 100, 500};
        int numero = 100;
        int n = 3;
        
        boolean resultado = validarConteo(numeros, numero, n);
        System.out.println(resultado);  // true
        
        System.out.println();
        
        numero = 500;
        resultado = validarConteo(numeros, numero, n);
        System.out.println(resultado);  // false
    }
    
    public static boolean validarConteo(int[] numeros, int numero, int n) {
        int conteo = 0;
        
        for(int i = 0; i < numeros.length;) {
            if (i < numeros.length - 1 && numeros[i] == numero && numeros[i + 1] == numero) {
                return false;
            }
            
            if (i < numeros.length - 1 && numeros[i] == numero && numeros[i + 1] != numero) {
                ++conteo;
                
                i += 2;
                
                continue;
            } else if (i == numeros.length - 1 && numeros[i] == numero) {
                ++conteo;
            }
            
            ++i;
        }
        
        return conteo == n;
    }
}
