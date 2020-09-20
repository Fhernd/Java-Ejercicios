package ejercicio0000377;

/**
 * Ejercicio 377: Demostrar diferentes mecanismos para la concatenación 
 * de cadenas de caracteres.
 *
 * @author John Ortiz Ordoñez
 */
public class ConcatenacionCadenas {

    public static void main(String[] args) {
        
        // "Hola, Java"
        
        // 1. El operador suma +
        String saludo = "Hola";
        String lenguaje = "Java";
        
        System.out.println(saludo + ", " + lenguaje);
        
        System.out.println();
        
        // 2. Método concat()
        String mensaje = saludo.concat(", ".concat(lenguaje));
        System.out.println(mensaje);
        
        System.out.println();
        
        // 3. Uso clase StringBuilder.
        StringBuilder contenido = new StringBuilder();
        contenido.append(saludo);
        contenido.append(", ");
        contenido.append(lenguaje);
        System.out.println(contenido.toString());
        
        System.out.println();
        
        // 4. Uso clase STringBuffer:
        StringBuffer buffer = new StringBuffer();
        buffer.append(saludo).append(", ").append(lenguaje);
        System.out.println(buffer.toString());
    }
}
