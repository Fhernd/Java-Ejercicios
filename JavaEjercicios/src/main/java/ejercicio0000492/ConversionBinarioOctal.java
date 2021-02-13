package ejercicio0000492;

/**
 * Ejercicio 492: Crear una función para convertir un número binario en un número octal.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionBinarioOctal {

    public static void main(String[] args) {
        
        int binario = 1111; // 17 [8]
        
        Resultado resultado = convertirBinarioOctal(binario);
        
        int[] octal = resultado.octal;
        
        for(int j = resultado.i - 1; j > 0; --j) {
            System.out.print(octal[j]);
        }
    }
    
    public static Resultado convertirBinarioOctal(int binario) {
        int[] octal = new int[100];
        int residuo;
        int decimal = 0;
        int i = 1;
        
        while (binario > 0) {
            residuo = binario % 10;
            decimal += residuo * i;
            
            i *= 2;
            
            binario /= 10;
        }
        
        i = 1;
        int cociente = decimal;
        
        while (cociente > 0) {
            octal[i] = cociente % 8;
            
            cociente /= 8;
            
            i++;
        }
        
        Resultado resultado = new Resultado();
        resultado.octal = octal;
        resultado.i = i;
        
        return resultado;
    }
}

class Resultado {
    public int[] octal;
    public int i;
}
