package ejercicio0000594;

import java.util.Scanner;

/**
 * Ejercicio 594: Convertir grados Fahrenheit a su equivalente en grados Celsius.
 *
 * @author John Ortiz Ordoñez.
 */
public class ConversionFahrenheitCelsius {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la temperatura en grados Fahrenheit: ");
        double gradosFahrenheit = Double.parseDouble(entrada.nextLine());
        
        System.out.println();
        
        double resultado = convertirFahrenheitACelsius(gradosFahrenheit);
        
        System.out.printf("%.2f °F = %.2f °C\n", gradosFahrenheit, resultado);
    }
    
    public static double convertirFahrenheitACelsius(double gradosFahrenheit) {
        double celsius = ((5 * (gradosFahrenheit - 32)) / 9.0);
        
        return celsius;
    }
}
