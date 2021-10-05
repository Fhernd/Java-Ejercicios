package ejercicio0000598;

import java.util.Arrays;

/**
 * Ejercicio 598: Crear una función para obtener la cantidad de años y días que hay en una cantidad de segundos.
 *
 * @author John Ortiz Ordoñez.
 */
public class MinutosAgniosDias {
    
    public static final double SEGUNDOS_AGNIO = 60 * 60 * 24 * 365;
    
    public static void main(String[] args) {
        int segundos = 100 * 365 * 2237;
        
        long[] resultado = convertirTiempo(segundos);
        
        System.out.println(Arrays.toString(resultado));
    }
    
    public static long[] convertirTiempo(int segundos) {
        long agnios = (long) (segundos / SEGUNDOS_AGNIO);
        int dias = (int) (SEGUNDOS_AGNIO / 60 / 60 / 24) % 365;
        
        return new long[] {agnios, dias};
    }
}
