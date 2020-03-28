package ejercicio0000032;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class ValidarCodigo {
    public static void main(String[] args){
        int numero = 37;
        
        assert numero >= 42 : "El valor de la variable `numero` debe ser mayor o igual a 42";
        
        System.out.println("El programa continua su ejecución...");
    }
}
