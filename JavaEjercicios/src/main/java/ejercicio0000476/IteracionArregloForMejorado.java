package ejercicio0000476;

/**
 * Ejercicio 476: Usar un ciclo for mejorado para iterar un arreglo de 
 * valores.
 *
 * @author John Ortiz Ordoñez
 */
public class IteracionArregloForMejorado {
    
    public static void main(String[] args) {
        
        int primos[] = new int[10];
        primos[0] = 2;
        primos[1] = 3;
        primos[2] = 5;
        primos[3] = 7;
        primos[4] = 11;
        primos[5] = 13;
        primos[6] = 17;
        primos[7] = 19;
        primos[8] = 23;
        primos[9] = 29;
        
        for (int primo : primos) {
            System.out.println(primo);
        }
    }
}
