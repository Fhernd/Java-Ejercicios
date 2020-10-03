package ejercicio0000391;

/**
 * Ejercicio 391: Usar el método estático printf() para imprimir contenido 
 * dinámico.
 *
 * @author John Ortiz Ordoñez
 */
public class ImpresionContenidoDinamico {

    public static void main(String[] args) {
        
        String nombre = "Daniela";
        int edad = 26;
        
        // printf: impresión con formato:
        System.out.printf("El nombre de la persona es %s y su edad es %d.\n", nombre, edad);
        
        System.out.println();
        
        edad = 27;
        
        System.out.printf("El nombre la persona es %s y su edad es %d.\n", nombre, edad);
        
        // La función String.format() permite guardar el resultado de la 
        // salida en una variable.
    }
}
