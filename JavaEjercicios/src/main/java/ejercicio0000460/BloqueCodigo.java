package ejercicio0000460;

/**
 * Ejercicio 460: Crear un cuerpo de implementación sobre una expresión 
 * lambda.
 *
 * @author John Ortiz Ordoñez
 */
public class BloqueCodigo {

    public static void main(String[] args) {
        
        // NOTA IMPORTANTE: Dentro del cuerpo de implementación de una 
        // expresión lambada no pueden ir las palabras claves break y continue.
        
        CodigoOperacion codigoOperacion = (operacion) -> {
            switch(operacion) {
                case "ACTIVO":
                    return 1;
                case "INACTIVO":
                    return 0;
                default:
                    return -1;
            }
        };
        
        String operacion = "ACTIVO";
        int codigo = codigoOperacion.obtenerCodigoOperacion(operacion);
        System.out.println(codigo);
        
        System.out.println();
        
        operacion = "INACTIVO";
        codigo = codigoOperacion.obtenerCodigoOperacion(operacion);
        System.out.println(codigo);
        
        System.out.println();
        
        operacion = "INDEFINIDO";
        codigo = codigoOperacion.obtenerCodigoOperacion(operacion);
        System.out.println(codigo);
    }
}

interface CodigoOperacion {
    int obtenerCodigoOperacion(String operacion);
}
