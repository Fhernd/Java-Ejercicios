package ejercicio0000130;

/**
 * Ejercicio 130: Uso de la clase Character.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoClaseCharacter {

    public static void main(String[] args) {
        
        System.out.println("Método isDigit:");
        System.out.println(Character.isDigit('P'));
        System.out.println(Character.isDigit('0'));
        
        System.out.println("\nMétodo isLetterOrDigit:");
        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(Character.isLetterOrDigit('0'));
        System.out.println(Character.isLetterOrDigit('*'));
        
        System.out.println("\nMétodo isLowerCase: ");
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        
        System.out.println("\nMétodo isUpperCase:");
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        
        System.out.println("\nMétodo isSpace:");
        System.out.println(Character.isSpace('A'));
        System.out.println(Character.isSpace(' '));
        System.out.println(Character.isSpace('\t'));
        System.out.println(Character.isSpace('\n'));
        
        System.out.println("\nMétodo toString:");
        System.out.println(Character.toString('A'));
        System.out.println(Character.toString('A') instanceof String);
    }
}
