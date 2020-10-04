package ejercicio0000393;

/**
 * Ejercicio 393: Redondear los valores NEGATIVE_INFINITY Y POSITIVE_INFINITY 
 * de las clases Float y Double.
 *
 * @author John Ortiz Ordoñez
 */
public class RedondeoMaximos {

    public static void main(String[] args) {
        
        System.out.println(Math.round(Float.NEGATIVE_INFINITY));
        System.out.println(Math.round(Float.POSITIVE_INFINITY));
        
        System.out.println();
        
        System.out.println(Math.round(Double.NEGATIVE_INFINITY));
        System.out.println(Math.round(Double.POSITIVE_INFINITY));
    }
}
