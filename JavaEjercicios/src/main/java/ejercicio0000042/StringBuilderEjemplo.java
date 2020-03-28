package ejercicio0000042;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class StringBuilderEjemplo {
    public static void main(String[] args){
        StringBuilder lenguaje = new StringBuilder();
        
        lenguaje.append("Java ");
        lenguaje.append("es ");
        lenguaje.append("un lenguaje ");
        lenguaje.append("de programación...");
        lenguaje.append(" génial");
        
        
        System.out.println(lenguaje);
        
        System.out.println(new StringBuilder().append("Java ").append("es ").append("un lenguaje").append(" de programación...").append(" génial"));
    }
}
