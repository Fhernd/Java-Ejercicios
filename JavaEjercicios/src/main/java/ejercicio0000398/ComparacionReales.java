package ejercicio0000398;

/**
 * Ejercicio 398: Usar el método compareTo() de Float para comparar números 
 * de punto flotante.
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionReales {

    public static void main(String[] args) {
        Float real1 = new Float("7.531");
        Float real2 = new Float("-1.237");
        Float real3 = new Float("-1.237");
        Float real4 = new Float("0.531");
        
        // compareTo(Float)
        // -1: el objeto que invoca compareTo() es menor al argumento.
        // 0: los dos números son iguales.
        // 1: el objeto que invoca compareTo() es mayor al argumento.
        System.out.println(real1.compareTo(real4)); // 1
        System.out.println(real2.compareTo(real3)); // 0
        System.out.println(real3.compareTo(real4)); // -1
    }
}
