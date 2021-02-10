package ejercicio0000490;

/**
 * Ejercicio 490: Crear una función para convertir un número binario en un número 
 * decimal.
 * 
 * @author John Ortiz Ordoñez
 */
public class ConversionBinarioDecimal {

    public static void main(String[] args) {
        
        long binario = 1111;    // 15
        
        long resultado = convertirBinarioDecimal(binario);
        
        System.out.println(resultado);
    }
    
    public static long convertirBinarioDecimal(long binario) {
        long decimal = 0;
        long residuo;
        int j = 1;
        
        while (binario != 0) {
            residuo = binario % 10;
            decimal += residuo * j;
            
            j *= 2;
            
            binario /= 10;
        }
        
        return decimal;
    }
}
