package ejercicio0000088;

/**
 * Ejercicio 88: Identificar números capicúa.
 * 
 * @author John Ortiz Ordoñez
 */
public class NumerosCapicua {
    public static void main(String[] args) {
        int numero = 1231;
        
        System.out.println("¿El número " + numero + " es capicúa?: " + esCapicua(numero));
    }
    
    public static boolean esCapicua(int numero){
        String palabra = String.valueOf(numero);
        
        for (int i = 0, j = palabra.length() - 1; i <= j; i++, --j) {
            if (palabra.charAt(i) != palabra.charAt(j)){
                return false;
            }
        }
        
        return true;
    }
}
