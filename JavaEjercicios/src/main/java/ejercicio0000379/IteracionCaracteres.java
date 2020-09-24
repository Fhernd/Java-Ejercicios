package ejercicio0000379;

/**
 * Ejercicio 379: Iterar una cadena de caracteres en ambas direcciones.
 *
 * @author John Ortiz Ordoñez
 */
public class IteracionCaracteres {

    public static void main(String[] args) {
        
        String frase = "¡Java es tremendo!";
        
        for(int i = 0; i < frase.length(); ++i) {
            System.out.print(frase.charAt(i));
        }
        
        System.out.println();
        System.out.println();
        
        for(int i = frase.length() - 1; i >= 0; --i) {
            System.out.print(frase.charAt(i));
        }
    }
}
