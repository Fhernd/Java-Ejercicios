package ejercicio0000532;

/**
 * Ejercicio 532: Definir una función para remover el primer carácter de cada palabra de una frase.
 *
 * @author John Ortiz Ordoñez
 */
public class RemocionPrimerCaracter {

    public static void main(String[] args) {
        
        String frase = "Java es un lenguaje de programación y plataforma de desarrollo";
        
        String resultado = removerPrimerCaracterPorPalabra(frase);
        
        
        System.out.println(frase);
        System.out.println(resultado);
    }
    
    public static String removerPrimerCaracterPorPalabra(String frase) {
        String[] palabras = frase.split(" ");
        
        String resultado = "";
        
        for (String p : palabras) {
            if (p.length() > 1) {
                resultado += p.substring(1, p.length());
            } else {
                resultado += p;
            }
            
            resultado += " ";
        }
        
        return resultado;
    }
}
