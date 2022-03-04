package ejercicio0000604;

/**
 * Ejercicio 604: Invertir una palabra por medio de un ciclo for con iteración por índices.
 *
 * @author John Ortiz Ordoñez.
 */
public class InversionPalabra {

    public static void main(String[] args) {
        String palabra = "Dostoevsky";
        System.out.println(palabra);    // Dostoevsky
        
        System.out.println();
        
        System.out.println(invertirPalabra(palabra)); // yksveotsoD
    }
    
    public static String invertirPalabra(String palabra) {
        String resultado = "";
        char[] caracteres = palabra.toCharArray();
        
        for (int i = caracteres.length - 1; i >= 0; --i) {
            resultado += caracteres[i];
        }
        
        return resultado;
    }
}
