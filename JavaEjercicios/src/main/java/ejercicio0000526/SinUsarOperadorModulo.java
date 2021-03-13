package ejercicio0000526;

/**
 * Ejercicio 526: Definir una función para calcular el módulo de dos números sin usar el operador incorporado.
 *
 * @author John Ortiz Ordoñez
 */
public class SinUsarOperadorModulo {

    public static void main(String[] args) {
        
        // 5
        // 2
        // cociente = 2
        // residuo = 5 - (2 * 2) = 5 - 4 = 1
        
        int resultado = calcularResiduo(5, 2);
        System.out.println(resultado);  // 1
        
        System.out.println();
        
        resultado = calcularResiduo(11, 4);
        System.out.println(resultado);  // 3
    }
    
    public static int calcularResiduo(int dividendo, int divisor) {
        int cociente = dividendo / divisor;
        
        int residuo = dividendo - (cociente * divisor);
        
        return residuo;
    }
}
