package ejercicio0000371;

/**
 * Ejercicio 371: Comparar dos cadenas de caracteres utilizando el método 
 * equals().
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionIgualdad {

    public static void main(String[] args) {
        
        String lenguaje1 = "Java";
        String lenguaje2 = "java";
        
        System.out.println(lenguaje1);
        System.out.println(lenguaje2);
        
        System.out.println(lenguaje1.equals(lenguaje2));
        
        System.out.println();
        
        lenguaje2 = "Java";
        System.out.println(lenguaje1.equals(lenguaje2));
        
        System.out.println();
        
        System.out.println(lenguaje1 == lenguaje2);
        
        System.out.println();
        
        String lenguaje3 = new String("Java");
        
        System.out.println(lenguaje1 == lenguaje3);
        System.out.println(lenguaje2 == lenguaje3);
        
        System.out.println();
        
        System.out.println(lenguaje1.equals(lenguaje3));
        System.out.println(lenguaje2.equals(lenguaje3));
    }    
}
