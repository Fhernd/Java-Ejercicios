package ejercicio0000559;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Ejercicio 559: Extraer todos los datos de un arreglo que están antes de un dato dado.
 *
 * @author John Ortiz Ordoñez.
 */
public class SeccionArreglo {

    public static void main(String[] args) {
        
        int[] numeros = {11, 7, 5, 19, 29, 31, 2, 43, 13, 17};
        
        System.out.println(Arrays.toString(numeros));
        
        System.out.println();
        
        int numero = 31;
        
        int indice = Arrays.stream(numeros).boxed().collect(Collectors.toList()).indexOf(numero);
        
        if (numero != -1) {
            
            int[] resultado = Arrays.copyOfRange(numeros, 0, indice);
            
            System.out.println("Resultado:");
            System.out.println(Arrays.toString(resultado));
            
        } else {
            System.out.println("MENSAJE: El valor buscado no se encuentra en el arreglo.");
        }
    }
}
