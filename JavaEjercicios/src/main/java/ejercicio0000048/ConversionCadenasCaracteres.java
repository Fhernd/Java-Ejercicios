package ejercicio0000048;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionCadenasCaracteres {
    public static void main(String[] args){
        String lenguaje1 = "Java es Génial";
        String lenguaje2 = "java es génial";
        
        String lenguaje3 = lenguaje1.toUpperCase();
        System.out.println(lenguaje3);
        
        String lenguaje4 = lenguaje1.toLowerCase();
        System.out.println(lenguaje4);
        
        System.out.println(lenguaje1.equals(lenguaje2));
        
        System.out.println(lenguaje1.equalsIgnoreCase(lenguaje2));
    }
}
