package ejercicio0000397;

/**
 * Ejercicio 397: Comparar valores enteros usando operadores relacionales y el
 * método compare().
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionEnteros {

    public static void main(String[] args) {
        
        int puntaje1 = 2;
        int puntaje2 = 12;
        int puntaje3 = -7;
        
        // Operadores relacionales
        // <, <=, >, >=
        // ==, !=
        System.out.println("Operadores relacionales:");
        System.out.println(puntaje1 < puntaje2);    // true
        System.out.println(puntaje1 <= puntaje2);    // true
        System.out.println(puntaje3 > puntaje1);    // false
        System.out.println(puntaje3 >= puntaje1);    // false
        System.out.println(puntaje1 == puntaje2);   // false
        System.out.println(puntaje1 != puntaje2);   // true
        
        System.out.println();
        
        // Método static Integer.compare(int, int):
        // -> int
        // -1: cuando el primer argumento es menor al segundo
        // 0: cuando los dos números enteros son iguales
        // 1: cuando el primer argumento es mayor al segundo
        System.out.println("Método static Integer.compare(int, int)");
        System.out.println(Integer.compare(puntaje2, puntaje3));    // 1
        System.out.println(Integer.compare(puntaje3, puntaje2));    // -1
        System.out.println(Integer.compare(10, 10));    // 0
    }
}
