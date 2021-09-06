package ejercicio0000597;

import java.util.Scanner;

/**
 * Ejercicio 597: Crear una función para convertir una cantidad de metros en pulgadas.
 *
 * @author John Ortiz Ordoñez.
 */
public class ConversionMetrosPulgadas {

    public static void main(String[] args) {
        
        // 0.0254m = 1"
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la cantidad de metros: ");
        double metros = entrada.nextDouble();
        
        System.out.println();
        
        double pulgadas = convertirMetrosAPulgadas(metros);
        
        System.out.printf("%.2fm = %.2f\"\n", metros, pulgadas);
    }
    
    public static double convertirMetrosAPulgadas(double metros) {
        double pulgadas = metros / 0.0254;
        
        return pulgadas;
    }
}
