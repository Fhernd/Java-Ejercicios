package ejercicio0000407;

import java.util.Random;

/**
 * Ejercicio 407: Usar el método de instancia nextLong() para generar enteros 
 * de 64 bits.
 *
 * @author John Ortiz Ordoñez
 */
public class GeneracionEnterosLargos {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        long numeroEntero64Bits = aleatorio.nextLong();
        
        System.out.println(numeroEntero64Bits);
        
        System.out.println();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(aleatorio.nextLong());
        }
    }
}
