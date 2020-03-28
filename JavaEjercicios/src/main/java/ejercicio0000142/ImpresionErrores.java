package ejercicio0000142;

/**
 * Ejercicio 142: Imprimir errores en la salida estándar.
 * 
 * @author John Ortiz Ordoñez
 */
public class ImpresionErrores {

    public static void main(String[] args) {
        
        System.out.println("Java es génial");
        
        System.err.println("Este es un mensaje de error...\n");
        
        String cadena = "5a";
        int valor;
        
        try {
            valor = Integer.parseInt(cadena);
            
            System.out.println("Contenido de valor: " + valor);
        } catch (NumberFormatException e) {
            System.err.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
