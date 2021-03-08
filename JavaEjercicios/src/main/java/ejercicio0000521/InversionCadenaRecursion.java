package ejercicio0000521;

/**
 * Ejercicio 521: Invertir una cadena de caracteres utilizando una función recursiva.
 *
 * @author John Ortiz Ordoñez
 */
public class InversionCadenaRecursion {

    public static void main(String[] args) {
        
        String texto = "Java";
        String resultado = invertirCadenaRecursion(texto);
        System.out.println(texto);  // Java
        System.out.println(resultado); // avaJ
        
        System.out.println();
        
        System.out.println(invertirCadenaRecursion("NetBeans")); // snaeBteN
    }
    
    public static String invertirCadenaRecursion(String texto) {
        if (texto.length() == 1) {
            return texto;
        } else {
            return texto.charAt(texto.length() - 1) + invertirCadenaRecursion(texto.substring(0, texto.length() - 1));
        }
    }
}
