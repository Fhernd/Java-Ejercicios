package ejercicio0000051;

/**
 * Ejercicio 51: Remover el espacio en blanco de una cadena 
 * de caracteres.
 * 
 * @author John Ortiz Ordoñez
 */
public class RemocionEspacioBlanco {
    public static void main(String args[]){
        String lenguaje = "       \tJava es génial   \t\n";
        
        System.out.println(lenguaje);
        
        System.out.println(lenguaje.trim());
    }
}
