package ejercicio0000495;

/**
 * Ejercicio 495: Definir una función para convertir un número octal en un número hexadecimal.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionOctalHexadecimal {

    public static void main(String[] args) {
        
        System.out.println(convertirOctalhexadecimal("12"));    // A
        System.out.println(convertirOctalhexadecimal("17"));    // F
    }
    
    public static String convertirOctalhexadecimal(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        
        return Integer.toHexString(decimal);
    }
}
