package ejercicio0000629;

import java.util.Scanner;

/**
 * Ejercicio 629: Capturar un número, dividirlo entre 2 y tomar una decisión según su paridad.
 *
 * @author: John Ortiz Ordoñez
 */
public class RepeticionCalculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un número entero: ");
        int numero = Integer.parseInt(entrada.nextLine());

        while (numero != 1) {
            if (numero % 2 == 0) {
                numero /= 2;
            } else {
                numero = (3 * numero + 1) / 2;
            }

            System.out.println(numero);
        }

        entrada.close();
    }
}
