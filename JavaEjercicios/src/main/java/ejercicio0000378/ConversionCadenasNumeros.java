package ejercicio0000378;

/**
 * Ejercicio 378: Explorar mecanismos de conversión de cadenas en valores 
 * numéricos enteros.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionCadenasNumeros {

    public static void main(String[] args) {
        
        // 1. parseInt()
        System.out.println(Integer.parseInt("13")); // 13
        System.out.println(Integer.parseInt("A", 16));  // 10
        // 1 * 8 ^ 1 + 7 * 8 ^ 0 = 8 + 7 = 15
        System.out.println(Integer.parseInt("17", 8));   // 15
        System.out.println(Integer.parseInt("X123Y", 1, 4, 10));    // 123
        
        System.out.println();
        
        // 2. valueOf()
        System.out.println(Integer.valueOf("13"));  // 13
        System.out.println(Integer.valueOf(13));    // 13
        System.out.println(Integer.valueOf("A", 16));   // 10
        System.out.println(Integer.valueOf("17", 8));   // 15
        
        // NOTA IMPORTANTE: Estas funciones generan la excepción NumberFormatException cuando no es posible realizar la conversión.
    }
}
