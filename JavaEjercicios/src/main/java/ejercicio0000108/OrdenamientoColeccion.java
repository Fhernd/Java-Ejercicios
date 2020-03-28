package ejercicio0000108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Ejercicio 108: Ordenar una colección.
 * 
 * @author John Ortiz Ordoñez
 */
public class OrdenamientoColeccion {

    public static void main(String[] args) {
        
        String[] programas = new String[5];
        programas[0] = "Notepad++";
        programas[1] = "NetBeans";
        programas[2] = "Visual Studio Code";
        programas[3] = "IntelliJ";
        programas[4] = "Eclipse";
        
        System.out.println("Contenido del arreglo programas:");
        for (String programa : programas) {
            System.out.println(programa);
        }
        
        Arrays.sort(programas);
        
        System.out.println("\nContenido del arreglo programas:");
        for (String programa : programas) {
            System.out.println(programa);
        }
        
        // Ordenar un ArrayList:
        List<Integer> numeros = new ArrayList<>();
        numeros.add(13);
        numeros.add(7);
        numeros.add(7);
        numeros.add(19);
        numeros.add(0);
        
        System.out.println("\nContenido de numeros:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
        Collections.sort(numeros);
        System.out.println("\n\nContenido de numeros:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }        
    }
}
