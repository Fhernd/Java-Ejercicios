package ejercicio0000498;

/**
 * Ejercicio 498: Definir una función para convertir un número hexadecimal en un número octal.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionHexadecimalOctal {
    
    public static void main(String[] args) {
        
        String hexadecimal = "A";
        int decimal = convertirHexadecimalDecimal(hexadecimal);
        System.out.println(decimal);    // 10
        
        System.out.println();
        
        Resultado resultado = convertirHexadecimalOctal(decimal);
        
        for(int j = resultado.i - 1; j > 0; --j) {
            System.out.print(resultado.octal[j]);
        }
        
        // 12
    }
    
    public static Resultado convertirHexadecimalOctal(int decimal) {
        int[] octal = new int[100];
        int i = 1;
        
        while(decimal != 0) {
            octal[i] = decimal % 8;
            
            decimal /= 8;
            
            ++i;
        }
        
        Resultado resultado = new Resultado();
        resultado.octal = octal;
        resultado.i = i;
        
        return resultado;
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

class Resultado {
    public int[] octal;
    public int i;
}
