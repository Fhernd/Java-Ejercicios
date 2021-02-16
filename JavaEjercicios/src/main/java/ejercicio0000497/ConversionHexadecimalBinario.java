package ejercicio0000497;

/**
 * Ejercicio 497: Crear una función para convertir un número hexadecimal en un número binario.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionHexadecimalBinario {

    public static void main(String[] args) {
        
        String hexadecimal = "FF";
        int decimal = convertirHexadecimalDecimal(hexadecimal);
        System.out.println(decimal);    // 255
        
        System.out.println();
        
        Resultado resultado = convertirDecimalBinario(decimal);
        
        for(int j = resultado.i - 1; j > 0; --j) {
            System.out.print(resultado.binario[j]);
        }
    }
    
    public static Resultado convertirDecimalBinario(int decimal) {
        int[] binario = new int[100];
        int i = 1;
        
        while(decimal != 0) {
            binario[i] = decimal % 2;
            decimal /= 2;
            
            ++i;
        }
        
        Resultado resultado = new Resultado();
        resultado.binario = binario;
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
    public int[] binario;
    public int i;
}
