package ejercicio0000044;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class FormatoCadenasCaracteres {
    public static void main(String[] args){
        System.out.format("%.3f%n", Math.PI);
        
        System.out.format("%1$.3f - %1$.5f - %2$.4f%n", Math.PI, Math.E);
        System.out.format("%1$.3f - %<.5f - %2$.4f%n", Math.PI, Math.E);
    }
}
