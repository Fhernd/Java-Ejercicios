package ejercicio0000362;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejercicio 362: Gestión de errores con el mecanismo 
 * try-catch-with-resources mejorado en Java 9.
 *
 * @author John Ortiz Ordoñez
 */
public class ManejoErrores {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/main/resources/ejercicio362.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String contenido = "Java 9";
            
            escribirContenido(bw, contenido);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void escribirContenido(BufferedWriter bw, String contenido) {
        try(bw) {
            bw.write(contenido);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
