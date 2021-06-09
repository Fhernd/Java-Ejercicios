package ejercicio0000565;

/**
 * Ejercicio 565: Determinar con una función si un número dado es potencia de 4.
 *
 * @author John Ortiz Ordoñez.
 */
public class Potencia4 {

    public static void main(String[] args) {
        
        int numero = 64;
        
        System.out.println(esPotencia4(numero));    // true
        // 4^3 = 64
        
        System.out.println();
        
        System.out.println(esPotencia4(256));    // true
        // 4^4 = 256
        
        System.out.println();
        
        System.out.println(esPotencia4(512));    // false
        // 4^n = 512
    }
    
    public static boolean esPotencia4(int numero) {
        // &
        
        if (numero < 1) {
            return false;
        }
        
        if ((numero & (numero - 1)) != 0) {
            return false;
        }
        
        return (numero & 0x55555555) != 0;
    }
}
