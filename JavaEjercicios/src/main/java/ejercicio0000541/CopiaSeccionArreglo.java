package ejercicio0000541;

import java.util.Arrays;

/**
 * Ejercicio 541: Copiar una sección (rango) de un arreglo con la función copyOfRange() de Arrays.
 * 
 * @author John Ortiz Ordoñez
 */
public class CopiaSeccionArreglo {
    
    public static void main(String[] args) {
        
        String[] lenguajes = {"Go", "Perl", "Java", "Python", "JavaScript", "C#", "C++", "C"};
        System.out.println(lenguajes.length);
        
        for (String lenguaje : lenguajes) {
            System.out.print(lenguaje + " ");
        }
        
        System.out.println();
        System.out.println();
        
        String[] subArreglo = Arrays.copyOfRange(lenguajes, 2, 5);
        System.out.println(subArreglo.length);
        for (String lenguaje : subArreglo) {
            System.out.print(lenguaje + " ");
        }
    }
}
