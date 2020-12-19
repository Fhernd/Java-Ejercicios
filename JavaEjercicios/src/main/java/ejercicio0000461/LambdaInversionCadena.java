package ejercicio0000461;

/**
 * Ejercicio 461: Definir una expresión lambda para invertir el contenido de 
 * una cadena de caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class LambdaInversionCadena {

    public static void main(String[] args) {
        
        InvertirContenido inversionTexto = (texto) -> {
            String resultado = "";
            
            for (String e : texto.split(" ")) {
                resultado += new StringBuilder(e).reverse().toString() + " ";
            }
            
            return resultado;
        };
        
        String frase = "Java es un lenguaje de programación";
        
        System.out.println(frase);
        System.out.println();
        System.out.println(inversionTexto.invertir(frase));
    }
}

@FunctionalInterface
interface InvertirContenido {
    String invertir(String texto);
}
