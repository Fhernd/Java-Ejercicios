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
        
        System.out.println(x);  // 5
    }
}
