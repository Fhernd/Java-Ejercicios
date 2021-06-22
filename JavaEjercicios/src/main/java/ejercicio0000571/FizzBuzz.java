package ejercicio0000571;

/**
 * Ejercicio 571: Resolver el problema de FizzBuzz relacionado con múltiplos para los números de 1 a 100.
 *
 * @author John Ortiz Ordoñez.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    
    public static String fizzBuzz(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(numero);
        }
    }
}
