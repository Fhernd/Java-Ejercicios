package ejercicio0000392;

/**
 * Ejercicio 392: Redondear números de punto flotante (simple y doble) a 
 * números enteros.
 *
 * @author John Ortiz Ordoñez
 */
public class RedondeoFloats {

    public static void main(String[] args) {
        
        float valorFlotante = 1.73F;
        double valorDouble = 2.73;
        
        int resultado = redondearFloatAEntero(valorFlotante);
        System.out.println(resultado);  // 2
        
        System.out.println();
        
        long resultadoEnteroLargo = redondearDoubleAEntero(valorDouble);
        System.out.println(resultadoEnteroLargo);   // 3
    }

    private static int redondearFloatAEntero(float valorFlotante) {
        return Math.round(valorFlotante);
    }

    private static long redondearDoubleAEntero(double valorDouble) {
        return Math.round(valorDouble);
    }
}
