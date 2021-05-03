package ejercicio0000553;

/**
 * Ejercicio 553: Comprobar si un número dado aparece en posiciones impares o pares en un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class ElementosAdyacentes {

    public static void main(String[] args) {
        
        int[] numeros = {200, 100, 200, 300, 200, 500, 200};
        
        System.out.println(validarAparicionDato(numeros, 200)); // true
        
        numeros = new int[]{200, 100, 200, 300, 200, 500, 1000};
        System.out.println(validarAparicionDato(numeros, 200)); // false
    }
    
    public static boolean validarAparicionDato(int[] numeros, int numero) {
        boolean aparece = true;
        
        for (int i = 1; i < numeros.length; i += 2) {
            if (numeros[i] != numero) {
                aparece = false;
                break;
            }
        }
        
        if (aparece) {
            return true;
        }
        
        for (int i = 0; i < numeros.length; i += 2) {
            if (numeros[i] != numero) {
                return false;
            }
        }
        
        return true;
    }
}
