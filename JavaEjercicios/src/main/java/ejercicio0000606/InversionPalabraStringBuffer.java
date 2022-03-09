package ejercicio0000606;

/**
 * Ejercicio 606: Invertir una palabra usando el método reverse() de la clase StringBuffer.
 *
 * @author John Ortiz Ordoñez.
 */
public class InversionPalabraStringBuffer {

    public static void main(String[] args) {
        String frase = "Dostoevsky";
        
        StringBuffer stringBuffer = new StringBuffer(frase);
        
        String resultado = stringBuffer.reverse().toString();
        
        System.out.println(frase);  // Dostoevsky
        
        System.out.println();
        
        System.out.println(resultado);  // yksveotsoD
    }
}
