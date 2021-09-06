package ejercicio0000595;

import java.util.Scanner;

/**
 * Ejercicio 595: Convertir grados Celsius a su equivalente en grados Fahrenheit.
 *
 * @author John Ortiz Ordoñez.
 */
public class ConversionCelsiusFahrenheit {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la temperatura en grados Celsius: ");
        double celsius = entrada.nextDouble();
        
        System.out.println();
        
        double resultado = convertirGradosCelsiusAFahrenheit(celsius);
        
        System.out.printf("%.2f °C = %.2f °C\n", celsius, resultado);
    }
    
    public static double convertirGradosCelsiusAFahrenheit(double gradosCelsius) {
        double fahrenheit = (9.0/5.0) * gradosCelsius + 32;
        
        return fahrenheit;
    }
}
