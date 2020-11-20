package ejercicio0000437;

/**
 * Ejercicio 437: Escribir literales numéricas enteras y reales de forma 
 * más legible.
 *
 * @author John Ortiz Ordoñez
 */
public class LiteralesNumericasLegibles {

    public static void main(String[] args) {
        
        int unMillon = 1000000;
        System.out.println(unMillon);
        
        System.out.println();
        
        unMillon = 1_000_000;
        System.out.println(unMillon);
        
        System.out.println();
        
        int unBillon = 1_000_000_000;
        System.out.println(unBillon);
        
        System.out.println();
        
        double valor = 1_234_56.78_9123e2;
        System.out.println(valor);
    }
}
