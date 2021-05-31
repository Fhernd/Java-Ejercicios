package ejercicio0000563;

import java.util.Scanner;

/**
 * Ejercicio 563: Usar un ciclo while para sumar los dígitos de un número entero positivo.
 *
 * @author John Ortiz Ordoñez.
 */
public class SumarDigitosNumeroEntero {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;
        
        System.out.print("Digite un número entero positivo: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        System.out.printf("El número digita es: %d%n", numero);
        
        System.out.println();
        
        while (numero != 0) {
            suma += numero % 10;
            
            numero /= 10;
        }
        
        System.out.printf("El resultado de la suma de los dígitos es: %d%n", suma);
        
        // 12345 => 1 + 2 + 3 + 4 + 5: 15
        // 873 => 18
    }
}
