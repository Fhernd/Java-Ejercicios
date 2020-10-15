package ejercicio0000406;

import java.util.Random;

/**
 * Ejercicio 406: Generar valores lógicos booleanos con el método nextBoolean()
 * de la clase Random.
 *
 * @author John Ortiz Ordoñez
 */
public class GeneracionBooleanos {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(aleatorio.nextBoolean());
        }
        
        System.out.println();
        
        boolean valoresLogicos[] = new boolean[10];
        
        for (int i = 0; i < valoresLogicos.length; i++) {
            valoresLogicos[i] = aleatorio.nextBoolean();
        }
        
        for (int i = 0; i < valoresLogicos.length; i++) {
            System.out.println(valoresLogicos[i]);
        }
    }
}
