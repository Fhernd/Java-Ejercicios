package ejercicio0000550;

/**
 * Ejercicio 550: Validar si un número aparece después de otro número dado.
 *
 * @author John Ortiz Ordoñez.
 */
public class BusquedaSiguienteValor {

    public static void main(String[] args) {
        
        // [7, 2, 5, 3, 11, 19, 17]
        // primerNumero = 5
        // segundoNumero = 11
        // => true
        // primerNumero = 23
        // segundoNumero = 11
        // => false
        // primerNumero = 11
        // segundoNumero = 29
        // => false
        
        int[] numeros = {7, 2, 5, 3, 11, 19, 17};
        
        System.out.println(estaPresenteDespues(numeros, 5, 11));    // true
        System.out.println(estaPresenteDespues(numeros, 23, 11));    // false
        System.out.println(estaPresenteDespues(numeros, 11, 29));    // false
    }
    
    public static boolean estaPresenteDespues(int[] numeros, int primerNumero, int segundoNumero) {
        if (numeros.length <= 1) {
            return false;
        }
        
        int indice = buscarValor(numeros, primerNumero, 0);
        
        if (indice == -1) {
            return false;
        }
        
        if (indice == numeros.length - 1) {
            return false;
        }
        
        return buscarValor(numeros, segundoNumero, indice + 1) != -1;
    }
    
    public static int buscarValor(int[] numeros, int numero, int indiceInicio) {
        for (int i = indiceInicio; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                return i;
            }
        }
        
        return -1;
    }
}
