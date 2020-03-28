package ejercicio0000172;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejercicio 172: Cambiar los atributos de un archivo por medio de la 
 * clase File.
 * 
 * @author John Ortiz Ordoñez
 */
public class ModificacionAtributosArchivo {

    public static void main(String[] args) {
        
        final String NOMBRE_ARCHIVO = "temp-atributos.txt";
        
        try {
            
            File archivo = new File(NOMBRE_ARCHIVO);
            
            if (!archivo.createNewFile()){
                throw new IOException("No se pudo crear el archivo");
            }
            
            if(archivo.setReadOnly()){
                System.out.println("El archivo ahora es de sólo lectura.");
            } else {
                System.out.println("No se pudo cambiar a modo sólo lectura.");
            }
            
            System.out.println("Fecha/hora archivo: " + archivo.lastModified());
            
            if (archivo.setLastModified(System.currentTimeMillis())){
                System.out.println("Se estableció la fecha y hora actuales.");
            } else {
                System.out.println("No se pudo cambiar la fecha y hora del archivo.");
            }
            
            System.out.println("Fecha/hora archivo: " + archivo.lastModified());
            
            System.out.println("\n¿Se puede modificar?: " + archivo.canWrite());
            
            FileWriter fw = new FileWriter(archivo);
            fw.write("Texto del archivo...");
            fw.close();
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
