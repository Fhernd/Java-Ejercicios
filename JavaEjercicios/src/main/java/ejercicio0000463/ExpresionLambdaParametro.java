package ejercicio0000463;

/**
 * Ejercicio 463: Usar una expresión lambda como parámetro de una función.
 * 
 * @author John Ortiz Ordoñez
 */
public class ExpresionLambdaParametro {

    public static void main(String[] args) {
        ModificacionCadena exclamacion = (t) -> "¡" + t + "!";
        imprimir("Java es tremendo", exclamacion);
        // ¡Java es tremendo!
        
        System.out.println();
        
        imprimir("Hola", exclamacion); // ¡Hola!
        
        System.out.println();
        
        ModificacionCadena pregunta = (t) -> "¿" + t + "?";
        imprimir("Quién escribió Los Hermanos Karámazov", pregunta);
    }
    
    public static void imprimir(String texto, ModificacionCadena formato) {
        String resultado = formato.ejecutar(texto);
        
        System.out.println(resultado);
    }
}

interface ModificacionCadena {
    String ejecutar(String texto);
}
