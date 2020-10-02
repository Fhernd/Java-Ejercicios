package ejercicio0000390;

/**
 * Ejercicio 390: Crear una cadena de caracteres que contenga datos dinámicos.
 *
 * @author John Ortiz Ordoñez
 */
public class ImpresionCadenaFormato {

    public static void main(String[] args) {
        
        int edad = 26;
        String nombre = "Daniela";
        
        String cadenaFormato = "El nombre de la persona es %s y su edad es %d.";
        
        System.out.println(String.format(cadenaFormato, nombre, edad));
        
        System.out.println();
        
        edad = 27;
        
        System.out.println(String.format(cadenaFormato, nombre, edad));
    }
}
