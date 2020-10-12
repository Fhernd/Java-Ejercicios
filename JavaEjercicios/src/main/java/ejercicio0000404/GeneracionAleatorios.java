package ejercicio0000404;

import java.util.Random;

/**
 * Ejercicio 404: Generar valores numéricos aleatorios con la clase Random.
 *
 * @author John Ortiz Ordoñez
 */
public class GeneracionAleatorios {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt());
        System.out.println(aleatorio.nextInt(10));
        
        System.out.println();
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(aleatorio.nextInt(10));
        }
        
        System.out.println();
    }
}
