package ejercicio0000543;

import java.util.Arrays;

/**
 * Ejercicio 543: Mostrar la representación en texto de un arreglo con toString() de la clase Arrays.
 *
 * @author John Ortiz Ordoñez.
 */
public class RepresentacionTextoArreglo {

    public static void main(String[] args) {
        
        String[] lenguajes = {"Java", "Go", "JavaScript", "Python", "C++", "C", "C#", "F#"};
        
        System.out.println(lenguajes);
        
        System.out.println();
        
        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }
        
        System.out.println();
        
        System.out.println(Arrays.toString(lenguajes));
    }
}
