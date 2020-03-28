package ejercicio0000081;

import java.util.Random;

/**
 * Ejercicio 81: Generación de números aleatorios.
 * 
 * @author John Ortiz Ordoñez
 */
public class GeneracionAleatorios {
    public static void main(String[] args) {
        Random aleatorios = new Random();
        
        aleatorios.setSeed(42);
        
        System.out.println(aleatorios.nextInt());
        System.out.println(aleatorios.nextFloat());
        System.out.println(aleatorios.nextDouble());
        System.out.println(aleatorios.nextBoolean());
        System.out.println(aleatorios.nextLong());
    }
}
