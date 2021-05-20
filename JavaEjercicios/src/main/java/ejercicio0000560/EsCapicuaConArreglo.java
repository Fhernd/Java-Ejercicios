package ejercicio0000560;

/**
 * Ejercicio 560: Crear una función para validar si un número es capicúa usando un arreglo.
 *
 * @author John Ortiz Ordoñez.
 */
public class EsCapicuaConArreglo {

    public static void main(String[] args) {
        
        // oso
        // la tele letal
        // ana
        
        // 1001
        // 12021
        // 131
        // 242 => ["2", "4", "2"]
        
        System.out.println("1001: " + esCapicua(1001)); // true
        System.out.println("12021: " + esCapicua(12021));   // true
        System.out.println("12023: " + esCapicua(12023));   // false
        System.out.println("131: " + esCapicua(131));   // true
        System.out.println("242: " + esCapicua(242));   // true
        System.out.println("12345: " + esCapicua(12345));   // false
    }
    
    public static boolean esCapicua(int numero) {
        String[] digitos = String.valueOf(numero).split("");
        
        for (int i = 0, j = digitos.length - 1; i < digitos.length / 2; i++, --j) {
            if (!digitos[i].equals(digitos[j])) {
                return false;
            }
        }
        
        return true;
    }
}
