package ejercicio0000605;

/**
 * Ejercicio 605: Invertir una palabra usando el método reverse() de la clase StringBuilder.
 *
 * @author John Ortiz Ordoñez.
 */
public class InversionPalabraStringBuilder {
    
    public static void main(String[] args) {
        String frase = "Dostoevsky";
        System.out.println(frase);
        
        System.out.println();
        
        StringBuilder sb = new StringBuilder(frase);
        System.out.println(sb.reverse());
    }

}
