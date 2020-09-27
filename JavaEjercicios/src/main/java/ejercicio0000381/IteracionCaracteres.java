package ejercicio0000381;

/**
 * Ejercicio 381: Usar el método toCharArray() para iterar los caracteres de 
 * un texto.
 *
 * @author John Ortiz Ordoñez
 */
public class IteracionCaracteres {

    public static void main(String[] args) {
        
        String frase = "Java es un lenguaje de programación.";
        
        for (char caracter : frase.toCharArray()) {
            System.out.println(caracter);
        }
        
        System.out.println();
        
        char[] caracteres = frase.toCharArray();
        
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
    }
}
