package ejercicio0000509;

/**
 * Ejercicio 509: Obtener el valor ASCII de un carácter dado.
 *
 * @author John Ortiz Ordoñez
 */
public class ValorAsciiCaracter {
    
    public static void main(String[] args) {
        
        int codigoAsciiCaracter = '@';
        System.out.printf("El código ASCII para el carácter @ es %d.", codigoAsciiCaracter);    // 64
        
        System.out.println();
        
        codigoAsciiCaracter = 'A';
        System.out.printf("El código ASCII para el carácter A es %d.", codigoAsciiCaracter);    // 65
        
        System.out.println();
        
        codigoAsciiCaracter = 'a';
        System.out.printf("El código ASCII para el carácter a es %d.", codigoAsciiCaracter);    // 97
    }

}
