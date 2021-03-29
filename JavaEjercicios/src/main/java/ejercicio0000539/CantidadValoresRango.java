package ejercicio0000539;

/**
 * Ejercicio 539: Definir una función para contar la cantidad de valores en un rango según divisibilidad.
 *
 * @author John Ortiz Ordoñez
 */
public class CantidadValoresRango {

    public static void main(String[] args) {
        
        // x = 1
        // y = 10
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // d = 3
        // => 3
        
        // d = 5
        // => 2
        
        System.out.println(obtenerCantidadRango(1, 10, 3)); // 3
        System.out.println(obtenerCantidadRango(1, 10, 5)); // 2
        System.out.println(obtenerCantidadRango(1, 10, 7)); // 1
    }
    
    public static int obtenerCantidadRango(int inicio, int fin, int divisor) {
        if (inicio % divisor == 0) {
            return fin / divisor - inicio / divisor + 1;
        }
        
        return fin / divisor - inicio / divisor;
    }
}
