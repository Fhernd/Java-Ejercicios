package ejercicio0000522;

import java.util.Scanner;

/**
 * Ejercicio 522: Definir una función para obtener la penúltima palabra de una frase.
 *
 * @author John Ortiz Ordoñez
 */
public class PenultimaPalabra {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite una frase: ");
        String frase = entrada.nextLine();
        
        System.out.println();
        
        System.out.println(frase);
        
        System.out.println();
        
        String[] palabras = frase.split("[ ]+");
        
        String penultimaPalabra = palabras[palabras.length - 2];
        System.out.println(penultimaPalabra);
    }
}
