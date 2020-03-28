package ejercicio0000326;

import java.util.Scanner;

/**
 * Ejercicio 326: Consultar el descriptor de una clase o instancia con class y getClass().
 * 
 * @author John Ortiz Ordoñez
 */
public class DescriptorClaseInstancia {

    public static void main(String[] args) {
        System.out.println("Clase de Object: " + Object.class);
        System.out.println("Clase de String: " + String.class);
        System.out.println("Clase de Integer: " + Integer.class);
        System.out.println("Clase de Integer[]: " + Integer[].class);
        System.out.println("Clase de Scanner: " + Scanner.class);
        System.out.println("Clase de Computador: " + Computador.class);
        System.out.println("Clase para int: " + int.class);
        
        System.out.println();
        
        String lenguaje = "¡Java es tremendo!";
        System.out.println("Clase de la variable `lenguaje`: " + lenguaje.getClass());
        
        Computador computador = new Computador();
        System.out.println("Clase de la variable `computador`: " + computador.getClass());
    }
}

class Computador {
    
}
