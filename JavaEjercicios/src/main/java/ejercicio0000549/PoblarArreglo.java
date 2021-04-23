package ejercicio0000549;

import java.util.Arrays;

/**
 * Ejercicio 549: Poblar un arreglo con cadenas de caracteres que representen números enteros.
 *
 * @author John Ortiz Ordoñez.
 */
public class PoblarArreglo {

    public static void main(String[] args) {
        
        int n = 10;
        String[] numerosTexto = new String[n];
        
        for (int i = 0; i < numerosTexto.length; i++) {
            numerosTexto[i] = String.valueOf(i + 1);
        }
        
        System.out.println(Arrays.toString(numerosTexto));
    }
}
