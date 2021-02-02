package ejercicio0000483;

/**
 * Ejercicio 483: Obtener los caracteres indivuales de un texto con el 
 * método split().
 *
 * @author John Ortiz Ordoñez
 */
public class CaracteresIndividuales {
    
    public static void main(String[] args) {
        
        String lenguaje = "JavaScript";
        System.out.println(lenguaje);
        
        System.out.println();
        
        String caracteres[] = lenguaje.split("");
        
        System.out.println("Cantidad de caracteres del texto " + lenguaje + ": " + caracteres.length);
        
        System.out.println();
        
        for (String c : caracteres) {
            System.out.print(c + " ");
        }
    }
}
