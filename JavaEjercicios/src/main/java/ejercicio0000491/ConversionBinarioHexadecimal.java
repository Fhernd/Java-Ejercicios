package ejercicio0000491;

/**
 * Ejercicio 491: Crear una función para convertir un número binario en un número hexadecimal.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionBinarioHexadecimal {
    
    public static void main(String[] args) {
        
        int binario = 1111;
        Resultado resultado = convertirBinarioHexadecimal(binario);
        
        for(int j = resultado.i - 1; j >= 0; --j) {
            if (resultado.hexadecimal[j] > 9) {
                System.out.print((char)(resultado.hexadecimal[j] + 55));
            } else {
                System.out.print(resultado.hexadecimal[j]);
            }
        }
        
        // 15
    }

    public static Resultado convertirBinarioHexadecimal(int binario) {
        int i = 1;
        int residuo;
        int decimal = 0;
        int[] hexadecimal = new int[1000];
        
        while (binario > 0) {
            residuo = binario % 2;
            decimal += residuo * i;
            i *= 2;
            binario /= 10;
        }
        
        i = 0;
        
        while (decimal != 0) {
            hexadecimal[i] = decimal % 16;
            decimal /= 16;
            ++i;
        }
        
        Resultado resultado = new Resultado();
        resultado.hexadecimal = hexadecimal;
        resultado.i = i;
        
        return resultado;
    }
}

class Resultado {
    public int[] hexadecimal;
    public int i;
}
