package ejercicio0000041;

import java.util.StringTokenizer;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class EjemploStringTokenizer {
    public static void main(String[] args){
        String lenguaje = "Java es un lenguaje de programación... Génial";
        
        StringTokenizer particionesCadena = new StringTokenizer(lenguaje, " ");
        
        while(particionesCadena.hasMoreElements()){
            System.out.println("Partición: " + particionesCadena.nextElement());
        }
        
        lenguaje = "Java 8, Java 9| Java 10; Java 11";
        
        particionesCadena = new StringTokenizer(lenguaje, ",|;");
        
        while(particionesCadena.hasMoreElements()){
            System.out.println("Partición: " + particionesCadena.nextElement());
        }
    }
}
