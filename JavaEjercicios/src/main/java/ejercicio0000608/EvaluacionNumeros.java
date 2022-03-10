package ejercicio0000608;

import java.util.Scanner;

/**
 * Ejercicio 608: Evaluar dos números y comparar si ambos tienen el mismo módulo (residuo).
 *
 * @author John Ortiz Ordoñez.
 */
public class EvaluacionNumeros {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer número: ");
        int numero1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        System.out.print("Digite el segundo número: ");
        int numero2 = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        System.out.println(evaluarNumeros(numero1, numero2));
    }
    
    public static int evaluarNumeros(int x, int y) {
        if (x == y) {
            return 0;
        }
        
        if (x % 6 == y % 6) {
            return x < y ? x : y;
        }
        
        return y > x ? y : x;
    }
}
