package ejercicio0000405;

import java.util.Random;

/**
 * Ejercicio 405: Generar números reales usando el método nextDouble() de la 
 * clase Random.
 *
 * @author John Ortiz Ordoñez
 */
public class GeneracionReales {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        System.out.println(aleatorio.nextDouble());
        System.out.println(aleatorio.nextDouble());
        System.out.println(aleatorio.nextDouble());
        System.out.println(aleatorio.nextDouble());
        System.out.println(aleatorio.nextDouble());
        
        System.out.println();
        
        double realAleatorio = aleatorio.nextDouble();
        int enteroAleatorio = (int) (realAleatorio * 10);
        System.out.println(realAleatorio);
        System.out.println(enteroAleatorio);
    }
}
