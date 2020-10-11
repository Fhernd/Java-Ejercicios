package ejercicio0000401;

import java.math.BigDecimal;

/**
 * Ejercicio 401: Usar la Clase BigDecimal para realizar cálculos aritméticos 
 * sobre números grandes.
 *
 * @author John Ortiz Ordoñez
 */
public class SumaDecimalesGrandes {

    public static void main(String[] args) {
        
        BigDecimal numero1 = new BigDecimal("123456789123456789");
        BigDecimal numero2 = new BigDecimal("883456789123456789");
        
        BigDecimal suma = numero1.add(numero2);
        
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(suma);
        
        // double valorDemo = 1006913578246913578; // Integer number too large
    }
}
