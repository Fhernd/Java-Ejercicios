package ejercicio0000489;

/**
 * Ejercicio 489: Crear una función para convertir un número decimal en un número octal.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionDecimalOctal {

    public static void main(String[] args) {
        
        int decimal = 123;
        
        Resultado resultado = convertirDecimalOctal(decimal);
        
        for(int j = resultado.i - 1; j > 0; --j) {
            System.out.print(resultado.octal[j]);
        }
    }
    
    public static Resultado convertirDecimalOctal(int decimal) {
        int octal[] = new int[100];
        int cociente = decimal;
        int i = 1;
        
        while (cociente != 0) {
            octal[i] = cociente % 8;
            
            cociente /= 8;
            
            ++i;
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
