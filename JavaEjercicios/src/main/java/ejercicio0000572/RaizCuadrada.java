package ejercicio0000572;

/**
 * Ejercicio 572: Calcular la raíz cuadrada de un número dado a través de una función personalizada.
 *
 * @author John Ortiz Ordoñez.
 */
public class RaizCuadrada {

    public static void main(String[] args) {
        
        // Math.sqrt(2)
        
        System.out.println(calcularRaizCuadrada(25));   // 5
        System.out.println(calcularRaizCuadrada(16));   // 4
        System.out.println(calcularRaizCuadrada(100));   // 10
    }
    
    public static int calcularRaizCuadrada(int numero) {
        if (numero < 0) {
            throw new ArithmeticException("La raíz cuadrada no está definida para números negativos.");
        }
        
        if (numero == 0 || numero == 1) {
            return numero;
        }
        
        int a = 0;
        int b = numero;
        int mitad;
        
        while (a <= numero) {
            mitad  = (a + b) >> 1;
            
            if (numero / mitad < mitad) {
                b = mitad - 1;
            } else {
                if (numero / (mitad + 1) <= mitad) {
                    return mitad;
                }
                
                a = mitad + 1;
            }
        }
        
        return a;
    }
}
