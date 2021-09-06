package ejercicio0000596;

import java.util.Scanner;

/**
 * Ejercicio 596: Crear una función para convertir una cantidad de pulgadas en metros.
 *
 * @author John Ortiz Ordoñez.
 */
public class ConversionPulgadasMetros {

    public static void main(String[] args) {
        
        // 1m = 0.0254"
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite la cantidad de pulgadas: ");
        double pulgadas = entrada.nextDouble();
        
        System.out.println();
        
        System.out.printf("%.2f\" = %.2fm\n", pulgadas, convertirPulgadasAMetros(pulgadas));
    }
    
    public static double convertirPulgadasAMetros(double pulgadas) {
        double metros = pulgadas * 0.0254;
        
        return metros;
    }
}
