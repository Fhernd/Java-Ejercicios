package ejercicio0000527;

/**
 * Ejercicio 527: Definir una función personalizada para calcular la suma de los números primos hasta 1000.
 *
 * @author John Ortiz Ordoñez
 */
public class SumaPrimos {

    public static void main(String[] args) {
        
        int total = sumarPrimosHasta1000();
        
        System.out.println(total);
    }
    
    public static int sumarPrimosHasta1000() {
        int sumaPrimos = 2;
        
        for(int i = 3; i <= 1000; ++i) {
            if (i % 2 == 1 && esPrimo(i)) {
                sumaPrimos += i;
            }
        }
        
        return sumaPrimos;
    }

    public static boolean esPrimo(int numero) {
        for(int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
