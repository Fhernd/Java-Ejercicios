package ejercicio0000384;

import java.util.Scanner;

/**
 * Ejercicio 384: Validar el ingreso de datos del usuario a través del método matches().
 *
 * @author John Ortiz Ordoñez
 */
public class ValidacionEntrada {

    public static void main(String[] args) {
        
        Scanner lecturaDatos = new Scanner(System.in);
        int entrada;
        String respuesta;
        
        do {            
            System.out.print("Digite un número entero cualquiera: ");
            entrada = Integer.parseInt(lecturaDatos.nextLine());
            
            System.out.println();
            
            System.out.printf("El valor ingresado es: %d\n", entrada);
            
            System.out.println();
            
            do {
                System.out.print("¿Desea ingresar más datos? (Sí, No) :");
                respuesta = lecturaDatos.nextLine();
                
                System.out.println();
            } while(!respuesta.matches("Sí|No"));
            
            if (respuesta.equals("No")) {
                break;
            }
            
        } while (true);
    }
}
