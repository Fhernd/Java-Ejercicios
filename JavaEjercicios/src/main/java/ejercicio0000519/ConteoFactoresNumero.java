package ejercicio0000519;

/**
 * Ejercicio 519: Definir una función para contar el número de factores que tiene un número.
 *
 * @author John Ortiz Ordoñez
 */
public class ConteoFactoresNumero {

    public static void main(String[] args) {
        
        int numero = 25; // 1, 5, 25
        int resultado = contarFactores(numero);
        System.out.println(resultado);  // 3
        
        System.out.println();
        
        numero = 18; // 1, 2, 3, 6, 9, 18
        resultado = contarFactores(numero);
        System.out.println(resultado);  // 6
    }
    
    public static int contarFactores(int numero) {
        int contadorFactores = 0;
        
        for(int i = 1; i <= (int) Math.sqrt(numero); ++i) {
            
            if (numero % i == 0 && i * i != numero) {
                contadorFactores += 2;
            } else if (i * i == numero) {
                ++contadorFactores;
            }
        }
        
        return contadorFactores;
    }
}
