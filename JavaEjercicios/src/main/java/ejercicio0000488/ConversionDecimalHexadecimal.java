package ejercicio0000488;

/**
 * Ejercicio 488: Definir una función para convertir un número decimal en un 
 * número hexadecimal.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionDecimalHexadecimal {

    public static void main(String[] args) {
        
        int numeroDecimal = 255;
        
        String resultado = convertirDecimalAHexadecimal(numeroDecimal);
        
        System.out.printf("%d (10) = %s (16)\n", numeroDecimal, resultado);
    }
    
    public static String convertirDecimalAHexadecimal(int numeroDecimal) {
        int residuo;
        String hexadecimal = "";
        char[] hexadecimales = {'0', '1', '2', '3', '4', '4', '5', '6', '7', '8',
                                '9', 'A', 'B', 'C', 'D', 'F'};
        
        while (numeroDecimal > 0) {
            residuo = numeroDecimal % 16;
            hexadecimal = hexadecimales[residuo] + hexadecimal;
            
            numeroDecimal /= 16;
        }
        
        return hexadecimal;
    }
}
