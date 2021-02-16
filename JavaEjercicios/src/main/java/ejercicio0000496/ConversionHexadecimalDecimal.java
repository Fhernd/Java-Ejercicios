package ejercicio0000496;

/**
 * Ejercicio 496: Definir una función para convertir un número hexadecimal en un número decimal.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionHexadecimalDecimal {

    public static void main(String[] args) {
        
        String hexadecimal = "FF";
        System.out.println(convertirHexadecimalDecimal(hexadecimal));   // 255
    }
    
    public static int convertirHexadecimalDecimal(String hexadecimal) {
        final String DIGITOS = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        
        int decimal = 0;
        
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            int digito = DIGITOS.indexOf(caracter);
            
            decimal = 16 * decimal + digito;
        }
        
        return decimal;
    }
}
