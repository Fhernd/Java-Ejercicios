package ejercicio0000068;

/**
 * Ejercicio 68: Validar si un objeto String representa un número 
 * válido.
 * 
 * @author John Ortiz Ordoñez
 */
public class ValidacionNumeros {
    public static void main(String[] args) {
        String numero = "3.141592";
        
        try{
            double pi = Double.parseDouble(numero);

            System.out.println(pi);
        } catch(NumberFormatException e){
            System.out.println("Se ha producir un error durante la conversión. El número no es válido.");
        }
    }
}
