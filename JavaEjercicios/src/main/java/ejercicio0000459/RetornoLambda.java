package ejercicio0000459;

/**
 * Ejercicio 459: Crear una interfaz funcional para obtener un texto desde 
 * una expresión lambda.
 * 
 * @author John Ortiz Ordoñez
 */
public class RetornoLambda {

    public static void main(String[] args) {
        
        RetornoTexto obtencionTexto = () -> {
            return "¡Hola, Lambda!";
        };
        
        System.out.println(obtencionTexto.obtenerTexto());
        
        System.out.println();
        
        obtencionTexto = () -> "¡Hola, Lambda!";
        
        System.out.println(obtencionTexto.obtenerTexto());
    }
}

interface RetornoTexto {
    String obtenerTexto();
}
