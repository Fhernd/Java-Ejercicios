package ejercicio0000511;

import java.util.Scanner;

/**
 * Ejercicio 511: Dado un número n calcular la suma n + nn + nnn.
 *
 * @author John Ortiz Ordoñez
 */
public class ComputoSuma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.print("Digite un número entero positivo: ");
        n = entrada.nextInt();
        
        int suma = n + n * n + n * n * n; // n + n^2 + n^3
        System.out.println(suma);
    }
}
