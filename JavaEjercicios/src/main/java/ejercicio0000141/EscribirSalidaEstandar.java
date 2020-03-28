package ejercicio0000141;

import java.io.PrintWriter;

/**
 * Ejercicio 141: Escribir sobre la salida estándar.
 * 
 * @author John Ortiz Ordoñez
 */
public class EscribirSalidaEstandar {

    public static void main(String[] args) {
        
        System.out.print("Java es génial\n");
        
        double pi = Math.PI;
        
        System.out.printf("%.2f\n", pi);
        
        System.out.println("Java 12\n");
        
        // PrintWriter
        System.out.println("");
        
        PrintWriter pw = new PrintWriter(System.out);
        
        // Concatenación:
        int a = 2;
        int b = 3;
        int suma = a + b;
        System.out.println("La suma de " + a + " + " + b + " es igual a " + suma);
        System.out.println(suma + '=' + " 5");
        System.out.println(suma + "=" + " 5");
    }
}
