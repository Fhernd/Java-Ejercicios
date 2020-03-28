package ejercicio0000129;

import java.util.Scanner;

/**
 * Ejercicio 128: Uso de la clase Scanner para lectura desde el teclado.
 *
 * @author John Ortiz Ordoñez
 */
public class UsoClaseScanner {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        String nombre;
        double salario;
        int peso = 0;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Ingrese su peso: ");
        try {
            peso = Integer.parseInt(entrada.nextLine());
            
        } catch (NumberFormatException e) {
            System.out.println("Mensaje: " + e.getMessage());
        }
        
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.print("Ingrese su salario: ");
        salario = entrada.nextDouble();
        
        System.out.printf("\nNombre: %s - Edad: %d - Peso: %d - Salario: %.2f\n", nombre, edad, peso, salario);

    }
}
