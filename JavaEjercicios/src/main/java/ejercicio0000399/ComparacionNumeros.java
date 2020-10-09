package ejercicio0000399;

/**
 * Ejercicio 399: Usar el método static compare() para comparar valores de 
 * punto flotante.
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionNumeros {

    public static void main(String[] args) {
        
        // java.lang.Float.compare(float, float)) -> int:
        // -1: indica que el primer argumento es menor al segundo.
        // 0: indica que ambos números son iguales.
        // 1: indica que el primer argumento es mayor al segundo.
        
        float real1 = 3.1415f;
        float real2 = 1.4142f;
        float real3 = 3.1415f;
        float real4 = -2.7172f;
        
        System.out.println(Float.compare(real2, real1));    // -1
        System.out.println(Float.compare(real1, real3));     // 0
        System.out.println(Float.compare(real3, real4));    // 1
    }
}
