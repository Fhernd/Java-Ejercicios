package ejercicio0000452;

/**
 * Ejercicio 452: Utilizar el método getName() para obtener el tipo de dato 
 * de una variable.
 *
 * @author John Ortiz Ordoñez
 */
public class TipoVariable {

    public static void main(String[] args) {
        
        String lenguaje = "Java";
        System.out.println(lenguaje.getClass().getName());
        
        System.out.println();
        
        Persona persona = new Persona();
        System.out.println(persona.getClass().getName());
    }
}

class Persona {
    
}

