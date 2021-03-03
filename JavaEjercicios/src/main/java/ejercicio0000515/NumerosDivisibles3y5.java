package ejercicio0000515;

/**
 * Ejercicio 515: Encontrar los números que sean divisibles por 3 y 5 en el rango 1 a 100.
 *
 * @author John Ortiz Ordoñez
 */
public class NumerosDivisibles3y5 {

    public static void main(String[] args) {
        
        for(int n = 1; n <= 100; ++n) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n);
            }
        }
    }
}
