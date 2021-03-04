package ejercicio0000516;

import java.util.Scanner;

/**
 * Ejercicio 516: Convertir un número entero ingresado por el usuario usando la función parseInt().
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionCadenaEntero {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        String dato = entrada.nextLine();
        
        System.out.println();
        
        int numero = Integer.parseInt(dato);
        System.out.printf("El valor numérico es: %d\n", numero);
    }
}
