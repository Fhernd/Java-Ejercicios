package ejercicio0000087;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Ejercicio 87: Manejo de valores numéricos grandes.
 * 
 * @author John Ortiz Ordoñez
 */
public class ManejoNumerosGrandes {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        
        System.out.println("\nTrabajando con la clase BigInteger:");
        BigInteger enteroGrande = new BigInteger("10223372036854775807");
        System.out.println(enteroGrande);
        System.out.println(enteroGrande.add(enteroGrande));
        System.out.println(enteroGrande.pow(2));
        System.out.println(enteroGrande.pow(5));
        
        System.out.println("\nTrabajando con la clase BigDecimal:");
        BigDecimal decimalGrande = new BigDecimal("9223372036854775807.12345646464");
        System.out.println(decimalGrande);
        System.out.println(decimalGrande.pow(10));
    }
}
