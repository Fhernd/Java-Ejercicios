package ejercicio0000566;

/**
 * Ejercicio 566: Sumar dos números sin usar operadores aritméticos.
 *
 * @author John Ortiz Ordoñez.
 */
public class SumarSinOperadorAritmetico {

    public static void main(String[] args) {
        
        // Operadores bitwise
        
        int x = 2;
        int y = 3;
        
        int acarreo;
        
        while (y != 0) {            
            acarreo = x & y;
            x = x ^ y;
            
            y = acarreo << 1;
        }
        
        // a = 10 & 11
        // a = 10
        // x = 10 ^ 11
        // x = 1
        // y = 100
        
        // a = 1 & 100
        // a = 0
        // x = 1 ^ 100
        // x = 101
        // y = 0
        
        System.out.println(x);  // 5 = 101
    }
}
