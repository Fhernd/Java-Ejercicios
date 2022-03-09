package ejercicio0000607;

import java.util.Scanner;

/**
 * Ejercicio 607: Leer tres números enteros y evaluar si la diferencia entre ellos es mayor o igual a 20.
 *
 * @author John Ortiz Ordoñez.
 */
public class EvaluacionEnteros {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el primer número: ");
        int x = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        System.out.print("Escriba el segundo número: ");
        int y = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        System.out.print("Escriba el tercer número: ");
        int z = Integer.parseInt(entrada.nextLine());
        
        System.out.println();
        
        boolean resultado = Math.abs(x - y) >= 20 || Math.abs(x - z) >= 20 || Math.abs(y - z) >= 20;
        
        System.out.println(resultado);
    }
}
