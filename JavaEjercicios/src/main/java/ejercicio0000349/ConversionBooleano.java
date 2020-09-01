package ejercicio0000349;

/**
 * Ejercicio 349: Convertir una cadena de caracteres a un valor booleano con Boolean.parseBoolean().
 *
 * @author John Ortiz Ordoñez
 */
public class ConversionBooleano {

    public static void main(String[] args) {
        String texto = "false";
        
        System.out.println("Contenido de la variable «texto»: " + texto);
        
        System.out.println();
        
        boolean valorLogico = Boolean.parseBoolean(texto);
        System.out.printf("Contenido de la variable «valorLogico»: %b\n", valorLogico);
        
        System.out.println();
        
        texto = "False";
        valorLogico = Boolean.parseBoolean(texto);
        System.out.printf("Contenido de la variable «valorLogico»: %b\n", valorLogico);
        
        System.out.println();
        
        texto = "true";
        valorLogico = Boolean.parseBoolean(texto);
        System.out.printf("Contenido de la variable «valorLogico»: %b\n", valorLogico);
        
        System.out.println();
        
        texto = "True";
        valorLogico = Boolean.parseBoolean(texto);
        System.out.printf("Contenido de la variable «valorLogico»: %b\n", valorLogico);
        
        System.out.println();
        
        texto = "FALSO";
        valorLogico = Boolean.parseBoolean(texto);
        System.out.printf("Contenido de la variable «valorLogico»: %b\n", valorLogico);
        
        System.out.println();
        
        texto = "JAVA";
        valorLogico = Boolean.parseBoolean(texto);
        System.out.printf("Contenido de la variable «valorLogico»: %b\n", valorLogico);
    }
}
