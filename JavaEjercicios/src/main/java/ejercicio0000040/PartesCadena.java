package ejercicio0000040;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class PartesCadena {
    public static void main(String[] args){
        String lenguaje = "Java es un lenguaje de programación... génial";
        
        System.out.println(lenguaje.substring(0, 4));
        System.out.println(lenguaje.substring(11));
        System.out.println("Java es génial".substring(0, 4));
        System.out.println(lenguaje.substring(11, lenguaje.length()));
    }
}
