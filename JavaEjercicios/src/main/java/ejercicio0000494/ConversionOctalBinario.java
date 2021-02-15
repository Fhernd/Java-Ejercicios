package ejercicio0000494;

/**
 * Ejercicio 494: Definir una función para convertir un número octal en un número binario.
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionOctalBinario {

    public static void main(String[] args) {
        
        long octal = 12;
        
        System.out.println(convertirOctalBinario(octal));   // 1010
    }
    
    public static long convertirOctalBinario(long octal) {
        int i = 1;
        long binario = 0;
        int residuo;
        int[] valores_octales = {0, 1, 10, 11, 100, 101, 110, 111};
        
        while(octal != 0) {
            residuo = (int) (octal % 10);
            binario += i * valores_octales[residuo];
            
            octal /= 10;
            
            i *= 1000;
        }
        
        return binario;
    }
}
