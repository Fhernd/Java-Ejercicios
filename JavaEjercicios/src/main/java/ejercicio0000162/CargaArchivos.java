package ejercicio0000162;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Ejercicio 162: Encontrar y cargar archivos independiente del sistema 
 * de archivos adyacente al ambiente de ejecución.
 * 
 * @author John Ortiz Ordoñez
 */
public class CargaArchivos {

    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "conexionbd.properties";
        
        try {
            
            InputStream archivo = CargaArchivos.class.getResourceAsStream(NOMBRE_ARCHIVO);
            
            Properties props = new Properties();
            props.load(archivo);
            
            System.out.println(props.toString());
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
