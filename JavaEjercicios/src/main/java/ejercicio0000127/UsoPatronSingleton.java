package ejercicio0000127;

/**
 * Ejercicio 127: Uso del patrón singleton.
 * 
 * @author John Ortiz Ordoñez
 */
public class UsoPatronSingleton {

    public static void main(String[] args) {
        
        ConexionBaseDatos conexion1 = ConexionBaseDatos.obtenerInstancia();
        ConexionBaseDatos conexion2 = ConexionBaseDatos.obtenerInstancia();
        
        System.out.println(conexion1.obtenerNumerosPersona());
        System.out.println(conexion2.obtenerNumerosPersona());
        
        System.out.println("");
        
        System.out.println(conexion1);
        System.out.println(conexion2);
    }
}

class ConexionBaseDatos{
    private static ConexionBaseDatos instancia;
    
    private ConexionBaseDatos(){
        // Operaciones relevantes para la conexión a la base de datos
    }
    
    static {
        instancia = new ConexionBaseDatos();
    }
    
    public static ConexionBaseDatos obtenerInstancia(){
        return instancia;
    }
    
    public int obtenerNumerosPersona(){
        return 10;
    }
}
