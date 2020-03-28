package ejercicio0000169;

import java.io.File;

/**
 * Ejercicio 169: Crear una copia de seguridad por medio del método renameTo.
 * 
 * @author John Ortiz Ordoñez
 */
public class CambiarNombreArchivo {
    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "lenguajes.txt";
        
        try{
            File archivoLenguajes = new File(NOMBRE_ARCHIVO);
            
            archivoLenguajes.renameTo(new File("lenguajes.txt.bak"));
            
            System.out.println("La copia de seguridad se realizó satisfactoriamente.");
            
        } catch(Exception e){
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
