package ejercicio0000403;

import java.math.BigDecimal;

/**
 * Ejercicio 403: Realizar operaciones aritméticas con la clase BigDecimal.
 *
 * @author John Ortiz Ordoñez
 */
public class AritmeticaBigDecimal {

    public static void main(String[] args) {
        
        BigDecimal numero1 = new BigDecimal("1234567891234567890");
        BigDecimal numero2 = new BigDecimal("9234567891234567890");
        BigDecimal numero3 = new BigDecimal("-234567891234567890");

        // Suma -> add()
        BigDecimal suma = numero1.add(numero2);
        System.out.println(suma);
        
        System.out.println();
        
        // Resta -> substract():
        BigDecimal resta = numero1.subtract(suma);
        System.out.println(resta);
        
        System.out.println();
        
        // Multiplicación -> multiply():
        BigDecimal multiplicacion = numero1.multiply(numero2);
        System.out.println(multiplicacion);
        
        System.out.println();
        
        // Valor absoluto -> abs():
        BigDecimal valorAbsoluto = numero3.abs();
        System.out.println(valorAbsoluto);
        
        // Potencia -> pow():
        BigDecimal potencia = numero1.pow(1000);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(potencia);
    }
}
