package ejercicio0000049;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class ComparacionStrings {
    public static void main(String[] args){
        String cadena1 = "Java";
        String cadena2 = "Java";
        
        // Comparación por referencia:
        System.out.println(cadena1 == cadena2);
        
        System.out.println(Integer.toHexString(System.identityHashCode(cadena1)));
        System.out.println(Integer.toHexString(System.identityHashCode(cadena2)));
        
        String cadena3 = new String("Java");
        
        System.out.println(cadena1 == cadena3);
        
        System.out.println(Integer.toHexString(System.identityHashCode(cadena3)));
        
        
        // Comparar por caracteres:
        System.out.println(cadena1.equals(cadena3));
        
        System.out.println(cadena1 == cadena3.intern());
    }
}
