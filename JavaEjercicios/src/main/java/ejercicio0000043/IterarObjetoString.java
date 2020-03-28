package ejercicio0000043;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class IterarObjetoString {
    public static void main(String[] args){
        String lenguaje = "¡Java es génial!";
        
        for (int i = 0; i < lenguaje.length(); i++) {
            System.out.printf("%c ", lenguaje.charAt(i));
        }
        
        System.out.println("");
        
        for (char caracter : lenguaje.toCharArray()) {
            System.out.printf("%c ", caracter);
        }
    }
}
